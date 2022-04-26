import static org.junit.Assert.assertEquals;

import static org.junit.Assert.fail;

import java.sql.Date;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Logger;

import javax.naming.NamingException;

import eBury_project.Cliente;
import eBury_project.Cuenta_Fintech;
import eBury_project.Usuario;
import exceptions.ClienteException;
import org.junit.Before;
import org.junit.Test;


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
		final List<Cuenta_Fintech> l = new ArrayList<Cuenta_Fintech>();
		final int idUsuario = 000;
		final String cont = "1234";
		final boolean es = true;

		try {
			Usuario u = new Usuario(idUsuario,cont, es);

			Cliente cliente = new Cliente(id,ident, tipoCliente,d,d2,direccion, ciudad, c_postal, pais, estado,l);
			gestionCliente.AltaCliente(cliente, u);

			assertEquals("No es el mismo cliente", cliente, gestionCliente.BuscarCliente(1) );

			} catch(ClienteException e){
				fail("Lanzó excepción al dar de Alta");
			}

	 }
	

	

}
