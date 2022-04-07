package eBury_project;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class Interna extends Transaccion{
    @Column(name= "Comision", nullable = false)
    private double Comision;
    @ManyToOne
    private Cuenta_eBury cuenta;
    
    public Interna(){
    	
    }

	public Interna(double comision, Cuenta_eBury cuenta) {
		Comision = comision;
		this.cuenta = cuenta;
	}

	public double getComision() {
		return Comision;
	}
	public void setComision(double comision) {
		Comision = comision;
	}
	public Cuenta_eBury getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta_eBury cuenta) {
		this.cuenta = cuenta;
	}
    
}
