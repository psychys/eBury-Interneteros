
import eBury_project.Cliente;
import exceptions.ClienteException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ClienteEJB implements GestionCliente{

    private static final Logger LOGGER =java.util.logging.Logger.getLogger(ClienteEJB.class.getCanonicalName());

    //@PersistenceContext(name="Trazabilidad")
    private EntityManager em;

    @Override
    public void ActualizarCliente(Cliente c) throws ClienteException {
        Cliente clienteExiste = em.find(Cliente.class, c);
        if (clienteExiste == null) {
            throw new ClienteException("Cliente no existente");
        }

        em.merge(c);

    }

    @Override
    public Cliente BuscarCliente(int id) throws ClienteException {
        Cliente c = em.find(Cliente.class, id);
        if(c == null){
            throw new ClienteException("Cliente no existente");
        }
        return c;
    }

    @Override
    public void MarcarCliente(Cliente c, String estado) throws ClienteException {

        Cliente clienteExistente = em.find(Cliente.class, c);

        if(c == null) {
            throw new ClienteException("Cliente no existente");
        }

        c.setEstado(estado);
        em.merge(c);

    }
    
    public void CrearCliente(Cliente c, UriBuilder uriBuilder) throws ClienteException{
        Cliente cliente = em.find(Cliente.class, c.getID());
        if(cliente!= null){
            throw new ClienteException("Cliente repetido");
        }

        c.setID(generarIdAleatorio());
        em.persist(c);

        URI uriValidacion = uriBuilder.build(c.getID());

        LOGGER.info(uriValidacion.toString());

    }

    private int generarIdAleatorio() {
        List lista = new ArrayList();
        lista = getListaClientes();
        return lista.size()+1;
    }

    public List<Cliente> getListaClientes() {
        // TODO
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        TypedQuery<Cliente> query = em.createQuery("SELECT p from Cliente p", Cliente.class);
        List<Cliente> listaProductos = query.getResultList();
        tx.commit();
        return listaProductos;

    }
}
