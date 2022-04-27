package es.uma.ejb;

import es.uma.jpa.Cliente;
import es.uma.jpa.Usuario;
import es.uma.exceptions.ClienteException;

public interface GestionCliente {

    //Requisito 2
    public void AltaCliente(Usuario c, Usuario u) throws ClienteException;

    //Requisito 3
    public void ActualizarCliente(Usuario admin, Usuario u) throws ClienteException;

    public Usuario BuscarCliente(int id) throws ClienteException;

    //Requisito 4
    public void MarcarCliente(Cliente c,String s, Usuario u) throws ClienteException;

}