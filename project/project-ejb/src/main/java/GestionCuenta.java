import eBury_project.Cuenta;
import exceptions.CuentaException;

public interface GestionCuenta {

    public void CrearCuenta(Cuenta c) throws CuentaException;

    public void ActualizarCuenta(Cuenta c) throws CuentaException;

    public Cuenta BuscarCuenta(int id) throws CuentaException;

    public void MarcarCuenta(Cuenta c,String s) throws CuentaException;

}
