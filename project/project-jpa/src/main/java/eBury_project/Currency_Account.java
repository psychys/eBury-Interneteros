package eBury_project;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class Currency_Account {

	@OneToOne
	private Cuenta_referencia c_ref;
}
