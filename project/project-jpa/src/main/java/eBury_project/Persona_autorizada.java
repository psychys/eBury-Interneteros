package eBury_project;

import javax.persistence.*;

@Entity
public class Persona_autorizada {

    @Id
    @Column(nullable = false)
    private String DNI;
    private String Nombre;
    private String Apellidos;

    @ManyToOne
    private Direccion direccion;

    public Persona_autorizada(String DNI, String nombre, String apellidos, Direccion direccion) {
        this.DNI = DNI;
        Nombre = nombre;
        Apellidos = apellidos;
        this.direccion = direccion;
    }

    public Persona_autorizada() {

    }

    public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

}
