package eBury_project;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//preguntar si hace falta el mappedBy
@Entity
public class Cuenta_referencia {
	@Id
	private String iban;
	@ManyToMany(mappedBy = "c_ref")
	private List<Pooled> pooled;
	@OneToMany
	@JoinTable(name = "referencia_segregated", 
		joinColumns = @JoinColumn(name = "c_ref_iban"), 
		inverseJoinColumns = @JoinColumn(name = "c_ebury_n_ref"))
	private List<Segregated> segregated;
	@OneToOne
	private Currency_Account c_account;
	@ManyToOne
	private Banco banco;

	public Cuenta_referencia(String iban, List<Pooled> pooled, List<Segregated> segregated, Currency_Account c_account, Banco banco) {
		this.iban = iban;
		this.pooled = pooled;
		this.segregated = segregated;
		this.c_account = c_account;
		this.banco = banco;
	}

	public Cuenta_referencia() {

	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public List<Pooled> getPooled() {
		return pooled;
	}

	public void setPooled(List<Pooled> pooled) {
		this.pooled = pooled;
	}

	public List<Segregated> getSegregated() {
		return segregated;
	}

	public void setSegregated(List<Segregated> segregated) {
		this.segregated = segregated;
	}

	public Currency_Account getC_account() {
		return c_account;
	}

	public void setC_account(Currency_Account c_account) {
		this.c_account = c_account;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public String get_iban(){
		return iban;
	}
	
	public void set_iban(String x){
		iban = x;
	}

	@Override
	public String toString() {
		return "Cuenta_referencia{" +
				"iban='" + iban + '\'' +
				", pooled=" + pooled +
				", segregated=" + segregated +
				", c_account=" + c_account +
				", banco=" + banco +
				'}';
	}
}
