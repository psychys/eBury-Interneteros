package eBury_project;

import javax.persistence.*;
import java.util.List;

@Entity
public class Banco {
    @Id
    private String nombre_banco;
    private String tipo_banco;

    @JoinColumn( name = "direccion_id" )
    @OneToOne
    private Direccion direccion;
    @OneToMany (mappedBy = "banco")
    private List<Cuenta_referencia> c_ref;
    @ManyToOne
    private Pais pais;

    public Banco(String nombre_banco, String tipo_banco, Direccion direccion, List<Cuenta_referencia> c_ref, Pais pais) {
        this.nombre_banco = nombre_banco;
        this.tipo_banco = tipo_banco;
        this.direccion = direccion;
        this.c_ref = c_ref;
        this.pais = pais;
    }

    public Banco() {

    }

    public String getNombre_banco() {
        return nombre_banco;
    }

    public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Cuenta_referencia> getC_ref() {
		return c_ref;
	}

	public void setC_ref(List<Cuenta_referencia> c_ref) {
		this.c_ref = c_ref;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getTipo_banco() {
        return tipo_banco;
    }

    public void setNombre_banco(String nombre_banco) { this.nombre_banco = nombre_banco; }

    public void setTipo_banco(String tipo_banco) {
        this.tipo_banco = tipo_banco;
    }
}

