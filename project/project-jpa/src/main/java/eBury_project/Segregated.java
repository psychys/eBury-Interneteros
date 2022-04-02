package eBury_project;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Segregated extends Cuenta_eBury{

	@ManyToOne
	private Cuenta_referencia c_ref;
}
