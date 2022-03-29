package eBury_project;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;


@Embeddable
public class Pooled {
	
	@ManyToMany
	private List<Cuenta_referencia> c_ref;
}
