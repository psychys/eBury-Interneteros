import java.sql.Date;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Logger;

import javax.naming.NamingException;

import es.uma.ejb.GestionCliente;
import es.uma.ejb.GestionUsuario;
import es.uma.exceptions.ClienteException;
import es.uma.exceptions.UsuarioException;
import es.uma.jpa.Cliente;
import es.uma.jpa.Cuenta_Fintech;
import es.uma.jpa.Usuario;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;


public class ClienteTest {
	
	private static final Logger LOG = Logger.getLogger(ClienteTest.class.getCanonicalName());

	private static final String UNIDAD_PERSITENCIA_PRUEBAS = "eBuryTest";
	private static final String CLIENTE_EJB = "java:global/classes/ClienteEJB";
	private static final String USUARIO_EJB = "java:global/classes/UsuarioEJB";

	private GestionCliente gestionCliente;
	private GestionUsuario gestionUsuario;


	@Before
	public void setup() throws NamingException  {
		gestionCliente = (GestionCliente) SuiteTest.ctx.lookup(CLIENTE_EJB);
		gestionUsuario = (GestionUsuario) SuiteTest.ctx.lookup(USUARIO_EJB);
		BaseDatos.inicializaBaseDatos(UNIDAD_PERSITENCIA_PRUEBAS);
	}

	//@Requisito 2
	@Test
	public void testAltaCliente() {

		final int id = 1;
		final int ident = 222222;
		final String tipoCliente = "cliente";
		final Date d = new Date(22,2,23);
		final Date d2 = new Date(20,5, 18);
		final String direccion = "calle platano 5";
		final String ciudad = "Malaga";
		final int  c_postal = 20749;
		final String pais = "España";
		final String estado = "activo";
		final int idadmin = 000;
		final String cont = "1234";
		final boolean es = true;

		try {
			Usuario admin = new Usuario(idadmin,cont, es);

			Cliente cliente = new Cliente(id,ident, tipoCliente,d,d2,direccion, ciudad, c_postal, pais, estado);

			gestionCliente.AltaCliente(admin, cliente);

			assertEquals("No es el mismo cliente", cliente, gestionCliente.BuscarCliente(1));

			} catch(ClienteException e){
				fail("Lanzó excepción al dar de Alta");
			}
	 }

	 //@Requisito 3
	@Test
	public void testActualizarCliente() {

		final int idadmin = 000;
		final String cont = "1234";
		final boolean es = true;

		try {
			Usuario admin = new Usuario(idadmin,cont,es);

			Cliente cliente = gestionCliente.BuscarCliente(1);

			String direccion = cliente.getDireccion();
			cliente.setDireccion("calle coco 25");
			gestionCliente.ActualizarCliente(admin, cliente);

			assertNotEquals("No se ha modificado", cliente.getDireccion(), direccion);

		} catch(ClienteException e){
			fail("Lanzó excepción al actualizar el cliente");
		}

	}
	@Test
	public void testMarcarCuenta(){
		final int id = 1;
		final int ident = 222222;
		final String tipoCliente = "cliente";
		final Date d = new Date(22,2,23);
		final Date d2 = new Date(20,5, 18);
		final String direccion = "calle platano 5";
		final String ciudad = "Malaga";
		final int  c_postal = 20749;
		final String pais = "España";
		final String estado = "activo";
		final int idUsuario = 000;
		final String cont = "1234";
		final boolean es = true;

		try{
			Usuario u = new Usuario(idUsuario, cont, es);
			Cliente c1 = new Cliente(id,ident, tipoCliente,d,d2,direccion, ciudad, c_postal, pais, estado);;
			gestionCliente.MarcarCliente(c1,"baja",u);
			assertNotEquals("No se ha marcado",c1.getEstado(),estado);

		} catch (ClienteException e) {
			e.printStackTrace();
		}
	}

}
