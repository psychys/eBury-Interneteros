import eBury_project.Cuenta;
import eBury_project.Usuario;
import exceptions.CuentaException;

import javax.ws.rs.core.UriBuilder;

public interface GestionCuenta {
    //Requisito 5
    public void CrearCuenta(Cuenta c,Usuario u, UriBuilder uriBuilder) throws CuentaException;

    public void ActualizarCuenta(Cuenta c) throws CuentaException;

    public Cuenta BuscarCuenta(int id) throws CuentaException;

    //Requisito 9
    public void MarcarCuenta(Cuenta c, String estado, Usuario u) throws CuentaException;

}
