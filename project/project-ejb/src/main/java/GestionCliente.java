import eBury_project.Cliente;
import exceptions.ClienteException;

import javax.ws.rs.core.UriBuilder;

public interface GestionCliente {

    //Requisito 2
    public void CrearCliente(Cliente c, UriBuilder u) throws ClienteException;

    //Requisito 3
    public void ActualizarCliente(Cliente c) throws ClienteException;

    public Cliente BuscarCliente(int id) throws ClienteException;


    //Requisito 4
    public void MarcarCliente(Cliente c,String s) throws ClienteException;




}
