package eBury_project;

import java.util.Date;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity
public class Pooled extends Cuenta_eBury{
	
	@ManyToMany
	@JoinTable(name = "pooled_referencia", 
		joinColumns = @JoinColumn(name = "c_ebury_n_cuenta"), 
		inverseJoinColumns = @JoinColumn(name = "c_ref_iban"))
	private List<Cuenta_referencia> c_ref;

	public Pooled(int n_cuenta, Date fecha_alta, Date fecha_baja, Cliente cliente, /*Saldo saldo, */List<Transaccion> transacciones, List<Interna> internas, List<Cuenta_referencia> c_ref) {
		super(n_cuenta, fecha_alta, fecha_baja, cliente, /*saldo, */transacciones, internas);
		this.c_ref = c_ref;
	}

	public Pooled() {

	}

	public List<Cuenta_referencia> getC_ref() {
		return c_ref;
	}

	public void setC_ref(List<Cuenta_referencia> c_ref) {
		this.c_ref = c_ref;
	}

	@Override
	public String toString() {
		return "Pooled{" +
				"c_ref=" + c_ref +
				'}';
	}
}
