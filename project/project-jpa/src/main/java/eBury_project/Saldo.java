package eBury_project;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Saldo {
	@Column(nullable = false)
	private int Cantidad;
	
	
	public int get_cantidad(){
		return Cantidad;
	}
	
	public void set_cantidad(int x){
		Cantidad = x;
	}
}
