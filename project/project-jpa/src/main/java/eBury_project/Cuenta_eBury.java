package eBury_project;

import java.util.Date;

import javax.persistence.*;


@Entity
public class Cuenta_eBury {
	@Id
	private int n_cuenta;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_alta;
	@Temporal(TemporalType.DATE)
	private Date fecha_baja;
	@Embedded
	private Currency_Account c_account;
	@Embedded
	private Pooled pooled;
	@Embedded
	private Segregated segregated;
	@ManyToOne
	private Cliente cliente;
	@OneToOne
	private Saldo saldo;

	public Cliente getCliente() {
		return cliente;
	}


	public int getN_cuenta() {
		return n_cuenta;
	}
	public void setN_cuenta(int n_cuenta) {
		this.n_cuenta = n_cuenta;
	}
	
	public Date getFecha_alta() {
		return fecha_alta;
	}
	
	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}
	
	public Date getFecha_baja() {
		return fecha_baja;
	}
	
	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}
	
	public Currency_Account getC_account() {
		return c_account;
	}
	
	public void setC_account(Currency_Account c_account) {
		this.c_account = c_account;
	}
	
	
}
