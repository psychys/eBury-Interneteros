import eBury_project.Transaccion;
import exceptions.TransaccionException;

public interface GestionTransaccion {

    public void CrearTransaccion(Transaccion t);

    public void ActualizarTransaccion(Transaccion t) throws TransaccionException;

    public Transaccion BuscarTransaccion(int id) throws TransaccionException;

    public void BorrarTransaccion(Transaccion t,String s) throws TransaccionException;

}
