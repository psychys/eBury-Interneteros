package eBury_project;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.IdClass;

@Entity
@IdClass(Datos_Id.class )
public class Empresa extends Cliente{

    @Column(unique=true)
    private String Nombre;
    @Column(nullable=false)
    private String Razon_social;
    @Column(unique=true)
    private String NIF;
    @Column(unique=true)
    private String Pagina_web;

    public Empresa(String nombre, String razon_social, String NIF, String pagina_web) {
        Nombre = nombre;
        Razon_social = razon_social;
        this.NIF = NIF;
        Pagina_web = pagina_web;
    }

    public Empresa() {

    }

    public String getNombre() {
        return Nombre;
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