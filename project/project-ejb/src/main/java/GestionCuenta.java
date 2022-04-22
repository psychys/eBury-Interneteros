import eBury_project.Cliente;
import exceptions.ClienteException;

public interface GestionCuenta {

    public void CrearCliente(Cliente c);

    public void ActualizarCliente(Cliente c) throws ClienteException;

    public Cliente BuscarCliente(int id) throws ClienteException;

    public void MarcarCliente(Cliente c,String s) throws ClienteException;

}
