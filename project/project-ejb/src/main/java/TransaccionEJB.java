import eBury_project.Cuenta;
import eBury_project.Transaccion;
import eBury_project.Usuario;
import exceptions.TransaccionException;
import exceptions.UsuarioException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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

        return t;

    }

    public boolean EsAutorizada(Transaccion t) throws TransaccionException {

        boolean res = false;
        Cuenta c_origen = t.getOrigen();

        if(c_origen.getEstado().equals("Administrador"))
            res=true;


        return res;
    }


    @Override
    public void BorrarTransaccion(Transaccion t, String estado) throws TransaccionException {

        Transaccion TransaccionExistente = em.find(Transaccion.class, t);

        if(t == null) {
            throw new TransaccionException("CLiente no existente");
        }

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(TransaccionExistente);
        tx.commit();

        }

    }


