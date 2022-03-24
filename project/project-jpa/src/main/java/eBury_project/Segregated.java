package eBury_project;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
public class Segregated {

	@ManyToOne
	private Cuenta_referencia c_ref;
}
