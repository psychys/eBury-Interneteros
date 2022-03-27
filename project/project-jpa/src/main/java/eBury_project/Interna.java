package eBury_project;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable

public class Interna {
    @Column(name= "Comision", nullable = false)
    private double Comision;
    @ManyToOne
    private Cuenta_eBury cuenta;
    
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
