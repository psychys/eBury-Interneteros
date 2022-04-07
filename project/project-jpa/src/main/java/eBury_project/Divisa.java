package eBury_project;

import javax.persistence.*;
import java.util.Collection;

//Entidad debil con saldo

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
    @Column(nullable = false)
    private double tipo_cambio_dolar;
    @ManyToMany
    @JoinTable(
            name = "divisa_pais",
            joinColumns = @JoinColumn(name = "divisa_id"),
            inverseJoinColumns = @JoinColumn (name="pais_id")
    )

    private Collection<Pais> paises;
    @ManyToMany
    @JoinTable(
            name = "divisa_transaccion",
            joinColumns = @JoinColumn(name = "divisa_id"),
            inverseJoinColumns = @JoinColumn (name="transaccion_id")
    )

    private Collection<Transaccion> divisas;

    public Divisa(String nombre_divisa, String abreviatura, String simbolo, double tipo_cambio_dolar, Collection<Pais> paises, Collection<Transaccion> divisas) {
        this.nombre_divisa = nombre_divisa;
        this.abreviatura = abreviatura;
        this.simbolo = simbolo;
        this.tipo_cambio_dolar = tipo_cambio_dolar;
        this.paises = paises;
        this.divisas = divisas;
    }

    public Divisa() {

    }

    public Collection<Pais> getPaises() {
		return paises;
	}
	public void setPaises(Collection<Pais> paises) {
		this.paises = paises;
	}
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


    public Collection<Transaccion> getDivisas() {
        return divisas;
    }

    public void setDivisas(Collection<Transaccion> divisas) {
        this.divisas = divisas;
    }

    //Preguntar si con esto cumple el requisito cambio de divisa
    public double cambiodivisa(double cantidad_euros){
        return cantidad_euros*tipo_cambio_dolar;
    }
}