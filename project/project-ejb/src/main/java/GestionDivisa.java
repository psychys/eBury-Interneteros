
import eBury_project.Divisa;
import eBury_project.Usuario;
import exceptions.DivisaException;

import javax.ws.rs.core.UriBuilder;

public interface GestionDivisa {

    public void CrearDivisa(Divisa d, UriBuilder uriBuilder, Usuario u) throws DivisaException;

    public void ActualizarDivisa(Divisa d, Usuario u) throws DivisaException;

    public Divisa BuscarDivisa(String abreviatura, Usuario u) throws DivisaException;
}
