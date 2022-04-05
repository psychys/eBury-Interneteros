package eBury_project;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Segregated extends Cuenta_eBury{

	@ManyToOne
	private Cuenta_referencia c_ref;

	public Cuenta_referencia getC_ref() {
		return c_ref;
	}

	public void setC_ref(Cuenta_referencia c_ref) {
		this.c_ref = c_ref;
	}
}
