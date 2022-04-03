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
	
	
	public int get_cantidad(){
		return Cantidad;
	}
	
	public void set_cantidad(int x){
		Cantidad = x;
	}
}
