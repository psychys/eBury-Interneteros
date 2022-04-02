package eBury_project;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@Entity
public class Pooled extends Cuenta_eBury{
	
	@ManyToMany
	private List<Cuenta_referencia> c_ref;
}
