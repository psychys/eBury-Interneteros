import eBury_project.*;
import exceptions.ClienteException;
import exceptions.CuentaException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class CuentaEJB implements GestionCuenta{

    //@PersistenceContext(name="Trazabilidad")
    private EntityManager em;


    @Override
    public void CrearCuenta(Cuenta c) throws CuentaException {

    }

    @Override
    public void ActualizarCuenta(Cuenta c) throws CuentaException {

    }

    @Override
    public Cuenta BuscarCuenta(int id) throws CuentaException {
        return null;
    }

    @Override
    public void MarcarCuenta(Cuenta c, String estado,Usuario u) throws CuentaException {
       if(u.isAdministrador()==true){
           //comprobar que tiene saldo 0 en todas sus divisas

           List<Cuenta_referencia> lista = pedirCuentaRef(c);
           //vamos a recorrer la lista y comprobar que todos sus saldos estan a 0
           boolean x = comprobarSaldo(lista);

           if(x){//tiene todas las divisas a 0
               Cuenta CuentaException = em.find(Cuenta.class, c);

               if(c == null) {
                   throw new CuentaException("Cuenta no existente");
               }

               c.setEstado(estado);
               em.merge(c);
           }else{
               throw new CuentaException("No tiene todas sus divisas a cero");
           }
       }else{

       }
       }

    private List<Cuenta_referencia> pedirCuentaRef(Cuenta c) {
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        TypedQuery<Cuenta_referencia> query = em.createQuery("SELECT p from Cuenta_referencia p", Cuenta_referencia.class);
        List<Cuenta_referencia> listaCuentaRef= query.getResultList();
        tx.commit();
        return listaCuentaRef;
    }

    private boolean comprobarSaldo(List<Cuenta_referencia> lista ) {
        boolean sol = true; //si es false es que tiene dinero en alguna cuenta

        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getSaldo()!=0){
                sol=false;
                break;
            }
        }
        return sol;
    }


}
