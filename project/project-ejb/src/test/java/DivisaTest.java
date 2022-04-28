/*

import es.uma.ejb.GestionDivisa;
import es.uma.exceptions.DivisaException;
import org.junit.Before;
import org.junit.Test;

import es.uma.jpa.Divisa;
import es.uma.jpa.Usuario;

import javax.naming.NamingException;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class DivisaTest {

    private static final Logger LOG = Logger.getLogger(DivisaTest.class.getCanonicalName());

    private static final String UNIDAD_PERSITENCIA_PRUEBAS = "eBuryTest";
    private static final String DIVISA_EJB = "java:global/classes/DivisaEJB";

    private GestionDivisa gestionDivisa;

    @Before
    public void setup() throws NamingException {
        gestionDivisa = (GestionDivisa) SuiteTest.ctx.lookup(DIVISA_EJB);
        BaseDatos.inicializaBaseDatos(UNIDAD_PERSITENCIA_PRUEBAS);
    }

    @Test
    public void testCrearDivisa() {
        final String abreviatura="USD";
        final String nombre="Dolar Estadounidense";
        final String simbolo="$";
        final Double cambioEuro = 1.07;
        final int idUser = 000;
        final String pw = "123";
        final boolean isAdmin = true;

        try {
            Divisa d = new Divisa(abreviatura, nombre, simbolo, cambioEuro);
            Usuario u = new Usuario(idUser, pw, isAdmin);
            gestionDivisa.CrearDivisa(d, u);

            assertEquals("No es la misma divisa", d, gestionDivisa.BuscarDivisa("USD",u));

        } catch (DivisaException e) {
            fail("Error al crear la divisa");
        }

    }

    @Test
    public void testBuscarDivisa(){

        final int idUser = 000;
        final String pw = "1234";
        final boolean isAdmin = true;

        try {
            Usuario u = new Usuario(idUser, pw, isAdmin);
            gestionDivisa.BuscarDivisa("USD",u);

        } catch (DivisaException e) {
            fail("Error al buscar la divisa");
        }
    }

    @Test
    public void testActualizarDivisa() {

        final int idUser = 000;
        final String pw = "1234";
        final boolean isAdmin = true;

        try {
            Usuario u = new Usuario(idUser, pw, isAdmin);
            Divisa d = gestionDivisa.BuscarDivisa("USD",u);

            assertEquals(d.getCambio_euro() ,1.07, 0);

            Double cE = d.getCambio_euro();
            d.setCambio_euro(1.1);

            gestionDivisa.ActualizarDivisa(d,u);

            assertNotEquals("No ha habido cambios en la divisa", cE , d.getCambio_euro());

        } catch (DivisaException e) {
            fail("Error al actualizar la divisa");
        }

    }

    @Test
    public void testEliminarDivisa() {

        final int idUser = 000;
        final String pw = "1234";
        final boolean isAdmin = true;

        try {
            Usuario u = new Usuario(idUser, pw, isAdmin);
            Divisa d = gestionDivisa.BuscarDivisa("USD",u);

            gestionDivisa.EliminarDivisa(d,u);

            assertEquals("Sigue existiendo la divisa", d, gestionDivisa.BuscarDivisa("USD",u));

        } catch (DivisaException e) {
            fail("Error al eliminar la divisa");
        }

    }

}
*/