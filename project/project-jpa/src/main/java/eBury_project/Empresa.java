package eBury_project;

import javax.persistence.*;
import java.util.Collection;

@Embeddable
public class Empresa {

    @Column(unique=true)
    private String Nombre;
    @Column(nullable=false)
    private String Razon_social;
    @Column(unique=true)
    private String NIF;
    @Column(unique=true)
    private String Pagina_web;
    //entidad debil
    @Embedded
    private Datos datos;
    

    public String getNombre() {
        return Nombre;
    }

    public Datos getDatos() {
		return datos;
	}

	public void setDatos(Datos datos) {
		this.datos = datos;
	}

	public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRazon_social() {
        return Razon_social;
    }

    public void setRazon_social(String razon_social) {
        Razon_social = razon_social;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getPagina_web() {
        return Pagina_web;
    }

    public void setPagina_web(String pagina_web) {
        Pagina_web = pagina_web;
    }
}