
import eBury_project.Cliente;
import eBury_project.Usuario;
import exceptions.ClienteException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ClienteEJB implements GestionCliente{

    private static final Logger LOGGER =java.util.logging.Logger.getLogger(ClienteEJB.class.getCanonicalName());

    @PersistenceContext(name="ClienteTest")
    private EntityManager em;

    //@Requisito 2
    public void AltaCliente(Usuario admin, Usuario u ) throws ClienteException{
        if(admin.isAdministrador()) {

            Usuario usuario = em.find(Usuario.class, u.getId());
            if (usuario != null) {
                throw new ClienteException("Cliente repetido");
            }

            em.persist(u);

        }else  {
            throw new ClienteException("NO ERES ADMINISTRADOR");
        }

    }
    // @Requisito 3
    @Override
    public void ActualizarCliente(Usuario admin, Usuario u) throws ClienteException {
        if (!u.isAdministrador()) {
            Usuario cliente = BuscarCliente(u.getC_cliente().getID());
            cliente.getC_cliente().setDireccion(u.getC_cliente().getDireccion());
            cliente.getC_cliente().setC_postal(u.getC_cliente().getC_postal());
            cliente.getC_cliente().setPais(u.getC_cliente().getPais());
            cliente.getC_cliente().setCiudad(u.getC_cliente().getCiudad());
            em.merge(cliente);


        }else{
            throw new ClienteException("NO ERES ADMINISTRADOR");
        }
    }

    @Override
    public Usuario BuscarCliente(int id) throws ClienteException {
        Usuario c = em.find(Usuario.class, id);
        if(c == null){
            throw new ClienteException("Cliente no existente");
        }
        return c;
    }

    //@Requisito 4
    @Override
    public void MarcarCliente(Cliente c, String estado, Usuario u) throws ClienteException {

        if(u.isAdministrador()) {

            Cliente clienteExistente = em.find(Cliente.class, c);

            if (c == null) {
                throw new ClienteException("Cliente no existente");
            }

            c.setEstado(estado);
            em.merge(c);

        }else{
            throw new ClienteException("NO ERES ADMINISTRADOR");
        }
    }

    /*public List<Cliente> getListaClientes() {
        // TODO
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        TypedQuery<Cliente> query = em.createQuery("SELECT p from Cliente p", Cliente.class);
        List<Cliente> listaProductos = query.getResultList();
        tx.commit();
        return listaProductos;

    }*/
}
