import eBury_project.Cliente;
import exceptions.ClienteException;

import javax.persistence.EntityManager;

public class AutorizacionEJB implements GestionAutorizacion{

    //@PersistenceContext(name="Trazabilidad")
    private EntityManager em;

    @Override
    public void CrearCliente(Cliente c) {

    }

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
            throw new ClienteException("CLiente no existente");
        }

        c.setEstado(estado);
        em.merge(c);

    }

}
