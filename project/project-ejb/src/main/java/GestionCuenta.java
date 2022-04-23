import eBury_project.Cuenta;
import eBury_project.Usuario;
import exceptions.CuentaException;

public interface GestionCuenta {

    public void CrearCuenta(Cuenta c) throws CuentaException;

    public void ActualizarCuenta(Cuenta c) throws CuentaException;

    public Cuenta BuscarCuenta(int id) throws CuentaException;

    //Requisito 9
    public void MarcarCuenta(Cuenta c, String estado, Usuario u) throws CuentaException;

}
