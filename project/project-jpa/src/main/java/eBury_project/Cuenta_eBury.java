package eBury_project;


import java.util.Date;
import java.util.List;

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

	@ManyToOne
	private Cliente cliente;
	//preguntar entidad debil
	@OneToOne
	private Saldo saldo;
	@OneToMany(mappedBy = "cuenta")
	private List<Transaccion> transacciones;
	@OneToMany
	private List<Interna> internas;

	public Cuenta_eBury(int n_cuenta, Date fecha_alta, Date fecha_baja, Cliente cliente, Saldo saldo, List<Transaccion> transacciones, List<Interna> internas) {
		this.n_cuenta = n_cuenta;
		this.fecha_alta = fecha_alta;
		this.fecha_baja = fecha_baja;
		this.cliente = cliente;
		this.saldo = saldo;
		this.transacciones = transacciones;
		this.internas = internas;
	}

	public Cuenta_eBury() {

	}

	public Saldo getSaldo() {
		return saldo;
	}


	public void setSaldo(Saldo saldo) {
		this.saldo = saldo;
	}


	public List<Transaccion> getTransacciones() {
		return transacciones;
	}


	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}


	public List<Interna> getInternas() {
		return internas;
	}


	public void setInternas(List<Interna> internas) {
		this.internas = internas;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


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


}
