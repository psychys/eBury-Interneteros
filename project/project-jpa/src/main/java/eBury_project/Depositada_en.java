package eBury_project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(DepositadaId.class)
public class Depositada_en{
	
	@Id
	@ManyToOne
	@JoinColumn(name = "iban_finetch" ,referencedColumnName = "cuenta_finetch")
	private String iban_finetch;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "iban_referencia" ,referencedColumnName = "cuenta_referencia")
	private String iban_referencia;
	
	@Id
	private int Saldo;

	public Depositada_en() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIban_finetch() {
		return iban_finetch;
	}

	public void setIban_finetch(String iban_finetch) {
		this.iban_finetch = iban_finetch;
	}

	public String getIban_referencia() {
		return iban_referencia;
	}

	public void setIban_referencia(String iban_referencia) {
		this.iban_referencia = iban_referencia;
	}

	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		Saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Saldo;
		result = prime * result
				+ ((iban_finetch == null) ? 0 : iban_finetch.hashCode());
		result = prime * result
				+ ((iban_referencia == null) ? 0 : iban_referencia.hashCode());
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
		Depositada_en other = (Depositada_en) obj;
		if (Saldo != other.Saldo)
			return false;
		if (iban_finetch == null) {
			if (other.iban_finetch != null)
				return false;
		} else if (!iban_finetch.equals(other.iban_finetch))
			return false;
		if (iban_referencia == null) {
			if (other.iban_referencia != null)
				return false;
		} else if (!iban_referencia.equals(other.iban_referencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Depositada_en [iban_finetch=" + iban_finetch
				+ ", iban_referencia=" + iban_referencia + ", Saldo=" + Saldo
				+ "]";
	}
	
	
	

}
