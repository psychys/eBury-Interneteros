package eBury_project;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "divisa")
public class Divisa {
    @Id
    @Column(name = "nombre_divisa", nullable = false)
    private String nombre_divisa;
    @Column(name= "abreviatura", unique = true, nullable = false)
    private String abreviatura;
    @Column(name= "simbolo", unique = true, nullable = false)
    private String simbolo;
    private double tipo_cambio_dolar;

    public String getNombre_divisa() {
        return nombre_divisa;
    }
    public String getAbreviatura() {
        return abreviatura;
    }
    public String getSimbolo() {return simbolo;}
    public double getTipo_cambio_dolar() {
        return tipo_cambio_dolar;
    }


    public void setNombre_divisa(String nombre_divisa) {
        this.nombre_divisa = nombre_divisa;
    }
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    public void setTipo_cambio_dolar(double tipo_cambio_dolar) {
        this.tipo_cambio_dolar = tipo_cambio_dolar;
    }

    @ManyToMany
    private Collection<Transaccion> divisas;

    public Collection<Transaccion> getDivisas() {
        return divisas;
    }

    public void setDivisas(Collection<Transaccion> divisas) {
        this.divisas = divisas;
    }

    @ManyToMany
    private Collection<Pais> paises;
}