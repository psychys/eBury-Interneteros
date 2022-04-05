package eBury_project;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@Entity
public class Pooled extends Cuenta_eBury{
	
	@ManyToMany
	private List<Cuenta_referencia> c_ref;

	public List<Cuenta_referencia> getC_ref() {
		return c_ref;
	}

	public void setC_ref(List<Cuenta_referencia> c_ref) {
		this.c_ref = c_ref;
	}
}
