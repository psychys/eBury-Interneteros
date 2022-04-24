import eBury_project.Cliente;
import eBury_project.Usuario;
import exceptions.ClienteException;
import exceptions.UsuarioException;

import javax.ws.rs.core.UriBuilder;

public interface GestionUsuario {

    public void CrearUsuario(Usuario c, UriBuilder uriBuilder) throws UsuarioException;

    public void ActualizarUsuario(Usuario c) throws UsuarioException;

    public Usuario BuscarUsuario(int id) throws UsuarioException;

    public void BorrarUsuario(Usuario c) throws UsuarioException;

}
