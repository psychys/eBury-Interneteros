import eBury_project.Cliente;
import eBury_project.Usuario;
import exceptions.UsuarioException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class UsuarioEJB implements GestionUsuario{

    //@PersistenceContext(name="Trazabilidad")
    private EntityManager em;
    private static final Logger LOGGER =java.util.logging.Logger.getLogger(ClienteEJB.class.getCanonicalName());

    @Override
    public void CrearUsuario(Usuario c, UriBuilder uriBuilder) throws UsuarioException {
        Usuario u1 = em.find(Usuario.class, c.getId());
        if(u1!= null){
            throw new UsuarioException("Cliente repetido");
        }
        c.setId(generarIdAleatorio());
        em.persist(c);

        URI uriValidacion = uriBuilder.build(c.getId());

        LOGGER.info(uriValidacion.toString());

    }

    @Override
    public void ActualizarUsuario(Usuario c) throws UsuarioException {
        Usuario clienteExiste = em.find(Usuario.class, c);
        if (clienteExiste == null) {
            throw new UsuarioException("Cliente no existente");
        }

        em.merge(c);

    }

    @Override
    public Usuario BuscarUsuario(int id) throws UsuarioException {
        Usuario c = em.find(Usuario.class, id);
        if(c == null){
            throw new UsuarioException("Cliente no existente");
        }
        return c;
    }

    @Override
    public void BorrarUsuario(Usuario c) throws UsuarioException {

        Usuario clienteExistente = em.find(Usuario.class, c);

        if(c == null) {
            throw new UsuarioException("CLiente no existente");
        }

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(c);
        tx.commit();

    }

    public List<Usuario> getListaUsuarios() {
        // TODO
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        TypedQuery<Usuario> query = em.createQuery("SELECT p from Usuario p", Usuario.class);
        List<Usuario> listaProductos = query.getResultList();
        tx.commit();
        return listaProductos;

    private int generarIdAleatorio() {
        List lista = new ArrayList();
        lista = getListaUsuarios();
        return lista.size()+1;
    }

}
