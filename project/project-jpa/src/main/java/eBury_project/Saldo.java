package eBury_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@IdClass(Saldo_Id.class)
public class Saldo {

	@Id
	@ManyToOne
	@JoinColumn(name = "n_divisa" ,referencedColumnName = "nombre_divisa")
	private Divisa nombre_divisa;
	@Id
	@ManyToOne
	@JoinColumn(name = "cuenta" ,referencedColumnName = "n_cuenta")
	private Cuenta_eBury n_cuenta;
	@Column(nullable = false)
	private int Cantidad;

	public Saldo(Divisa nombre_divisa, Cuenta_eBury n_cuenta, int cantidad) {
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

	public Divisa getNombre_divisa() {
		return nombre_divisa;
	}

	public void setNombre_divisa(Divisa nombre_divisa) {
		this.nombre_divisa = nombre_divisa;
	}

	public Cuenta_eBury getN_cuenta() {
		return n_cuenta;
	}

	public void setN_cuenta(Cuenta_eBury n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Saldo{" +
				"nombre_divisa='" + nombre_divisa + '\'' +
				", n_cuenta=" + n_cuenta +
				", Cantidad=" + Cantidad +
				'}';
	}
}
