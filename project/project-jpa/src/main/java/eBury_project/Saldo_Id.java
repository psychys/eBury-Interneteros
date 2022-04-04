package eBury_project;

import java.io.Serializable;

public class Saldo_Id implements Serializable {

	private int n_cuenta;
	private String nombre_divisa;
	
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
	
	
}
