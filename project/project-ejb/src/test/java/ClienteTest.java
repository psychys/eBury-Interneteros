import java.sql.Date;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Logger;

import javax.naming.NamingException;

import eBury_project.Cliente;
import eBury_project.Cuenta_Fintech;
import eBury_project.Usuario;
import exceptions.ClienteException;
import exceptions.UsuarioException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ClienteTest {
	
	private static final Logger LOG = Logger.getLogger(ClienteTest.class.getCanonicalName());

	private static final String UNIDAD_PERSITENCIA_PRUEBAS = "eBuryTest";
	private static final String CLIENTE_EJB = "java:global/classes/AlumnosEJB";

	private GestionCliente gestionCliente;

	@Before
	public void setup() throws NamingException  {
		gestionCliente = (GestionCliente) SuiteTest.ctx.lookup(CLIENTE_EJB);
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
		final List<Cuenta_Fintech> l = new ArrayList<>();
		final int idadmin = 000;
		final String cont = "1234";
		final boolean es = true;

		final int idusuario = 111;
		final String contusu = "1234";
		final boolean es1 = false;
		try {
			Usuario admin = new Usuario(idadmin,cont, es);

			Cliente cliente = new Cliente(id,ident, tipoCliente,d,d2,direccion, ciudad, c_postal, pais, estado,l);
			Usuario usuario = new Usuario(idusuario, contusu, es1, cliente);

			gestionCliente.AltaCliente(admin, usuario);

			assertEquals("No es el mismo cliente", usuario, gestionUsuario.BuscarUsuario(111));

			} catch(ClienteException | UsuarioException e){
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

			Usuario cliente = gestionCliente.BuscarCliente(1);

			String direccion = cliente.getC_cliente().getDireccion();
			cliente.getC_cliente().setDireccion("calle coco 25");
			gestionCliente.ActualizarCliente(admin, cliente);

			assertNotEquals("No se ha modificado", cliente.getC_cliente().getDireccion(), direccion);

		} catch(ClienteException e){
			fail("Lanzó excepción al actualizar el cliente");
		}

	}
	

}
