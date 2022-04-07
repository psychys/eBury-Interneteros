package eBury_project;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;


@Entity
public class Segregated extends Cuenta_eBury{

	@ManyToOne
	private Cuenta_referencia c_ref;

	public Segregated(int n_cuenta, Date fecha_alta, Date fecha_baja, Cliente cliente,/* Saldo saldo,*/ List<Transaccion> transacciones, List<Interna> internas, Cuenta_referencia c_ref) {
		super(n_cuenta, fecha_alta, fecha_baja, cliente, /*saldo, */transacciones, internas);
		this.c_ref = c_ref;
	}

	public Segregated() {

	}

	public Cuenta_referencia getC_ref() {
		return c_ref;
	}

	public void setC_ref(Cuenta_referencia c_ref) {
		this.c_ref = c_ref;
	}
}
