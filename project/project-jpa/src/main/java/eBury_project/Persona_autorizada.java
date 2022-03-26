package eBury_project;

import javax.persistence.*;
import java.util.Collection;

@Entity

public class Persona_autorizada {

    @Id
    @Column(nullable = false)
    private String DNI;
    private String Nombre;
    private String Apellidos;

    @Embedded
    private Datos datos;

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

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos =  datos;
    }
}
