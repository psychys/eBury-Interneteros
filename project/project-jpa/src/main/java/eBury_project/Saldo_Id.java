package eBury_project;


import java.io.Serializable;
import java.util.Objects;

public class Saldo_Id implements Serializable {

	private int n_cuenta;
	private String nombre_divisa;

	public Saldo_Id(int n_cuenta, String nombre_divisa) {
		this.n_cuenta = n_cuenta;
		this.nombre_divisa = nombre_divisa;
	}

	public int getN_cuenta() {
		return n_cuenta;
	}
	public void setN_cuenta(int n_cuenta) {
		this.n_cuenta = n_cuenta;
	}
	public String getNombre_divisa() {
		return nombre_divisa;
	}
	public void setNombre_divisa(String nombre_divisa) {
		this.nombre_divisa = nombre_divisa;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Saldo_Id saldo_id = (Saldo_Id) o;
		return n_cuenta == saldo_id.n_cuenta && Objects.equals(nombre_divisa, saldo_id.nombre_divisa);
	}

	@Override
	public int hashCode() {
		return Objects.hash(n_cuenta, nombre_divisa);
	}
}
