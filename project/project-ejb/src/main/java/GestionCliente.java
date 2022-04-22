import eBury_project.Cliente;
import exceptions.ClienteException;

public interface GestionCliente {

    //Requisito 2
    public void CrearCliente(Cliente c);

    //Requisito 3
    public void ActualizarCliente(Cliente c) throws ClienteException;

    public Cliente BuscarCliente(int id) throws ClienteException;


    //Requisito 4
    public void MarcarCliente(Cliente c,String s) throws ClienteException;




}
