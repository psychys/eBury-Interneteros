package eBury_project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cuenta_referencia {
	@Id
	private String iban;
	@ManyToMany
	private Pooled pooled;
	@OneToMany
	private Segregated segregated;
	@OneToOne
	private Currency_Account c_account;
	
	
	public String get_iban(){
		return iban;
	}
	
	public void set_iban(String x){
		iban = x;
	}
	
}
