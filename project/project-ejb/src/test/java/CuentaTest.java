import eBury_project.Cuenta;
import eBury_project.Usuario;
import exceptions.CuentaException;
import org.junit.Before;
import org.junit.Test;

import javax.naming.NamingException;
import javax.persistence.Column;
import java.util.logging.Logger;

import static org.junit.Assert.fail;

public class CuentaTest {

    private static final Logger LOG = Logger.getLogger(ClienteTest.class.getCanonicalName());
    private static final String UNIDAD_PERSITENCIA_PRUEBAS = "eBuryTest";
    private static final String CUENTA_EJB = "java:global/classes/CuentaEJB";


    private GestionCuenta gestionCuenta;

    @Before
    public void setup() throws NamingException {
        gestionCuenta = (GestionCuenta) SuiteTest.ctx.lookup(CUENTA_EJB);
        BaseDatos.inicializaBaseDatos(UNIDAD_PERSITENCIA_PRUEBAS);
    }

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

        }catch (CuentaException e) {
           fail("Lanzó excepción al dar de Alta");
        }


    }
}