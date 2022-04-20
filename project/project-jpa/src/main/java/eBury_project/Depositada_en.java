package eBury_project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
@IdClass(DepositadaId.class)
public class Depositada_en{
	
	@Id
	@ManyToOne
	@JoinColumn(name = "iban_pooled" ,referencedColumnName = "pooled_cuenta")
	private Pooled pooled;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "iban_referencia" ,referencedColumnName = "cuenta_referencia")
	private Cuenta_referencia cuenta_referencia;
	
	@Id
	private int Saldo;

	public Depositada_en() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pooled getPooled() {
		return pooled;
	}

	public void setPooled(Pooled pooled) {
		this.pooled = pooled;
	}

	public Cuenta_referencia getCuenta_referencia() {
		return cuenta_referencia;
	}

	public void setCuenta_referencia(Cuenta_referencia cuenta_referencia) {
		this.cuenta_referencia = cuenta_referencia;
	}

	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		Saldo = saldo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Depositada_en that = (Depositada_en) o;
		return Saldo == that.Saldo && Objects.equals(pooled, that.pooled) && Objects.equals(cuenta_referencia, that.cuenta_referencia);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pooled, cuenta_referencia, Saldo);
	}

	@Override
	public String toString() {
		return "Depositada_en{" +
				"pooled=" + pooled +
				", cuenta_referencia=" + cuenta_referencia +
				", Saldo=" + Saldo +
				'}';
	}
}
