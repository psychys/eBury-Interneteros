package eBury_project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuenta_referencia {
	@Id
	private String iban;
	
	public String get_iban(){
		return iban;
	}
	
	public void set_iban(String x){
		iban = x;
	}
	
}
