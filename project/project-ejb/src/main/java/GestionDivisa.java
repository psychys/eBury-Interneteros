
import eBury_project.Divisa;
import exceptions.DivisaException;

import javax.ws.rs.core.UriBuilder;

public interface GestionDivisa {

    public void CrearDivisa(Divisa d, UriBuilder uriBuilder) throws DivisaException;

    public void ActualizarDivisa(Divisa d) throws DivisaException;

    public Divisa BuscarDivisa(String abreviatura) throws DivisaException;

}
