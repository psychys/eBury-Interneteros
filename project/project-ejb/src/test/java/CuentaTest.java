import es.uma.jpa.Cuenta;
import es.uma.jpa.Usuario;
import es.uma.ejb.GestionCuenta;
import es.uma.exceptions.CuentaException;
import org.junit.Before;
import org.junit.Test;

import javax.naming.NamingException;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class CuentaTest {

    private static final Logger LOG = Logger.getLogger(ClienteTest.class.getCanonicalName());
    private static final String UNIDAD_PERSITENCIA_PRUEBAS = "eBuryTest";
    private static final String CUENTA_EJB = "java:global/classes/eBury_project.CuentaEJB";


    private GestionCuenta gestionCuenta;

    @Before
    public void setup() throws NamingException {
        gestionCuenta = (GestionCuenta) SuiteTest.ctx.lookup(CUENTA_EJB);
        BaseDatos.inicializaBaseDatos(UNIDAD_PERSITENCIA_PRUEBAS);
    }
    //@Requisitos({"RF5"})
    @Test
    public void testCrearCuenta(){
        final String iban="12345A";
        final String swift="123";
        final String estado="abierta";
        final int idUsuario = 000;
        final String cont = "1234";
        final boolean es = true;

        try {
            Cuenta c1 = new Cuenta(iban, swift, estado);
            Usuario u = new Usuario(idUsuario, cont, es);

            gestionCuenta.CrearCuenta(c1, u);

            assertEquals("No es la cuenta", c1, gestionCuenta.BuscarCuenta("12345A"));

        }catch (CuentaException e) {
           fail("Lanzó excepción al dar de Alta");
        }
    }

    @Test
    public void testBuscarCuenta(){
        try{
            gestionCuenta.BuscarCuenta("12345A");
        }catch (CuentaException e) {
            fail("Lanzó excepción al buscar cliente");
        }
    }

    @Test
    public void testactualizarCuenta(){
        final int idUsuario = 000;
        final String cont = "1234";
        final boolean es = true;

        try{
            Usuario u = new Usuario(idUsuario, cont, es);
            Cuenta c1 = gestionCuenta.BuscarCuenta("12345A");

            assertEquals(c1.getSWIFT() ,"123");
            String swift = c1.getSWIFT();
            c1.setSWIFT("456");
            gestionCuenta.ActualizarCuenta(c1,u);
            assertNotEquals("Deberia haberse actualizado la cuenta", swift , c1.getSWIFT());

        }catch (CuentaException e) {
            fail("Lanzó excepción al actualizar cliente");
        }
    }

    //@Requisitos({"RF9"})
    @Test
    public void testMarcarCuenta(){
        final int idUsuario = 000;
        final String cont = "1234";
        final boolean es = true;
        final String iban="12345A";
        final String swift="123";
        final String estado="abierta";

        try{
            Usuario u = new Usuario(idUsuario, cont, es);
            Cuenta c1 = new Cuenta(iban,swift,estado);
            gestionCuenta.MarcarCuenta(c1,"cerrado",u);
            assertNotEquals("No se ha marcado",c1.getEstado(),estado);

        }catch (CuentaException e) {
            fail("Lanzó excepción al marcar cliente");
        }
    }
}