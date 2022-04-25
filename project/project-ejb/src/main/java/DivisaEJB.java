
import eBury_project.Divisa;
import eBury_project.Usuario;
import exceptions.DivisaException;

import javax.persistence.EntityManager;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.logging.Logger;

public class DivisaEJB implements GestionDivisa{

    private static final Logger LOGGER = java.util.logging.Logger.getLogger(DivisaEJB.class.getCanonicalName());

    //@PersistenceContext(name="Trazabilidad")
    private EntityManager em;

    @Override
    public void CrearDivisa(Divisa d, UriBuilder uriBuilder, Usuario u) throws DivisaException{
        if(!u.isAdministrador()){
            throw new DivisaException("No eres administrador");
        }

        Divisa divisa = em.find(Divisa.class, d.getAbreviatura());
        if(divisa!= null){
            throw new DivisaException("Divisa repetida");
        }

        em.persist(d);

        URI uriValidacion = uriBuilder.build(d.getAbreviatura());
        LOGGER.info(uriValidacion.toString());

    }

    @Override
    public void ActualizarDivisa(Divisa d, Usuario u) throws DivisaException {
        if(!u.isAdministrador()){
            throw new DivisaException("No eres administrador");
        }

        Divisa divisaExiste = em.find(Divisa.class, d);
        if (divisaExiste == null) {
            throw new DivisaException("Divisa no existente");
        }

        em.merge(d);

    }

    @Override
    public Divisa BuscarDivisa(String abreviatura, Usuario u) throws DivisaException {
        if(!u.isAdministrador()){
            throw new DivisaException("No eres administrador");
        }

        Divisa d = em.find(Divisa.class, abreviatura);
        if(d == null){
            throw new DivisaException("Divisa no existente");
        }
        return d;
    }

}
