package eBury_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;


@Entity
@IdClass(Saldo_Id.class)
public class Saldo {

	@Id
	private String nombre_divisa;
	@Id
	private int n_cuenta;
	@Column(nullable = false)
	private int Cantidad;

	public Saldo(String nombre_divisa, int n_cuenta, int cantidad) {
		this.nombre_divisa = nombre_divisa;
		this.n_cuenta = n_cuenta;
		Cantidad = cantidad;
	}

	public Saldo() {

	}

	public int get_cantidad(){
		return Cantidad;
	}
	
	public void set_cantidad(int x){
		Cantidad = x;
	}

	public String getNombre_divisa() {
		return nombre_divisa;
	}

	public void setNombre_divisa(String nombre_divisa) {
		this.nombre_divisa = nombre_divisa;
	}

	public int getN_cuenta() {
		return n_cuenta;
	}

	public void setN_cuenta(int n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
}
