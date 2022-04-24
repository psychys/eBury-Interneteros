import eBury_project.Cuenta;
import eBury_project.Transaccion;
import exceptions.TransaccionException;

import javax.persistence.EntityManager;

public class TransaccionEJB implements GestionTransaccion{

    //@PersistenceContext(name="Trazabilidad")
    private EntityManager em;

    @Override
    public void CrearTransaccion(Transaccion t) {

    }

    @Override
    public Transaccion BuscarTransaccion(int id) throws TransaccionException {

        Transaccion t = em.find(Transaccion.class, id);
        if(t == null){
            throw new TransaccionException("Transaccion no existente");
        }

        Cuenta c1 = t.getOrigen();
        Cuenta c2 = t.getDestino();

       /* if(){
            return t;
        }else{
            throw new TransaccionException("No tienes permiso para consultar");
        }
        */

    }

    @Override
    public void BorrarTransaccion(Transaccion t, String estado) throws TransaccionException {

        Transaccion TransaccionExistente = em.find(Transaccion.class, t);

        if(t == null) {
            throw new TransaccionException("CLiente no existente");
        }

        t.setEstado(estado);
        em.merge(t);

    }

}
