package eBury_project;

import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;


@Embeddable
public class Pooled {
	
	@ManyToMany
	private Cuenta_referencia c_ref;
}
