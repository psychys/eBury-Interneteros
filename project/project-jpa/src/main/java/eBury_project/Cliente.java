package eBury_project;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Cliente {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Integer Identificador;
    @Column(nullable = false)
    private String Activo;
    @Column(unique=true)
    private String Correo;
    @Column(unique=true)
    private Integer Telefono;
    @Temporal(TemporalType.DATE)
    private Date Fecha_apertura;
    @Temporal(TemporalType.DATE)
    private Date Fecha_cierre;
    @Embedded
    private Empresa empresa;
    @Embedded
    private Individual individual;
    @OneToMany
    private Collection<Cuenta_eBury> cuentas_ebury;
    @ManyToOne
    private Direccion direccion;

    public Collection<Cuenta_eBury> getCuentas_ebury() {
        return cuentas_ebury;
    }

    public Empresa getIndivdual() {
        return empresa;
    }
    public Individual getIndividual() {
        return individual;
    }

    public Integer getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(Integer identificador) {
        Identificador = identificador;
    }

    public String getActivo() {
        return Activo;
    }

    public void setActivo(String activo) {
        Activo = activo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer telefono) {
        Telefono = telefono;
    }

    public Date getFecha_apertura() {
        return Fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        Fecha_apertura = fecha_apertura;
    }

    public Date getFecha_cierre() {
        return Fecha_cierre;
    }

    public void setFecha_cierre(Date fecha_cierre) {
        Fecha_cierre = fecha_cierre;
    }
}
