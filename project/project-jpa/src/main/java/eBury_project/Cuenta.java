package eBury_project;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Cuenta {
	
	@Id @GeneratedValue
	private String IBAN;
	private String SWIFT;
	@OneToMany //(mappedBy = "banco")
	@JoinTable(name = "cuenta_origen", 
	joinColumns = @JoinColumn(name = "cuenta"), 
	inverseJoinColumns = @JoinColumn(name = "id_trans"))
	private List<Transaccion> cuenta_emsior;
	
	@OneToMany //(mappedBy = "banco")
	@JoinTable(name = "cuenta_receptor", 
	joinColumns = @JoinColumn(name = "divisa"), 
	inverseJoinColumns = @JoinColumn(name = "id_trans"))
	private List<Transaccion> cuenta_receptor;
	
	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public String getSWIFT() {
		return SWIFT;
	}
	public void setSWIFT(String sWIFT) {
		SWIFT = sWIFT;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IBAN == null) ? 0 : IBAN.hashCode());
		result = prime * result + ((SWIFT == null) ? 0 : SWIFT.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (IBAN == null) {
			if (other.IBAN != null)
				return false;
		} else if (!IBAN.equals(other.IBAN))
			return false;
		if (SWIFT == null) {
			if (other.SWIFT != null)
				return false;
		} else if (!SWIFT.equals(other.SWIFT))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cuenta [IBAN=" + IBAN + ", SWIFT=" + SWIFT + "]";
	}
	
	

}
