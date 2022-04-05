package eBury_project;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Currency_Account extends Cuenta_eBury{

	@OneToOne
	private Cuenta_referencia c_ref;

	public Cuenta_referencia getC_ref() {
		return c_ref;
	}

	public void setC_ref(Cuenta_referencia c_ref) {
		this.c_ref = c_ref;
	}
}
