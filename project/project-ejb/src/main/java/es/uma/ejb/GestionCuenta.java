package es.uma.ejb;

import eBury_project.Cuenta;
import eBury_project.Usuario;
import es.uma.exceptions.CuentaException;

public interface GestionCuenta {
    //@Requisitos({"RF5"})
    public void CrearCuenta(Cuenta c,Usuario u) throws CuentaException;

    public void ActualizarCuenta(Cuenta c,Usuario u) throws CuentaException;

    public Cuenta BuscarCuenta(String IBAN) throws CuentaException;

    //@Requisitos({"RF9"})
    public void MarcarCuenta(Cuenta c, String estado, Usuario u) throws CuentaException;

}
