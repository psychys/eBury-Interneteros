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
    //requisito de login cumplido con correo y contrasena
    @Column(unique=true)
    private String Correo;
    @Column(nullable = false)
    private Integer contrasena;
    @Column(unique=true)
    private Integer Telefono;
    @Temporal(TemporalType.DATE)
    private Date Fecha_apertura;
    @Temporal(TemporalType.DATE)
    private Date Fecha_cierre;
    //Con el booleano administrador cumplimos el requisito de tener
    @Column(nullable = false)
    private boolean administrador;


    @OneToMany(mappedBy="cliente")
    private Collection<Cuenta_eBury> cuentas_ebury;
    @ManyToOne
    private Direccion direccion;

    public Cliente(Integer identificador, String activo, String correo, Integer contrasena, Integer telefono, Date fecha_apertura, Date fecha_cierre, boolean administrador, Collection<Cuenta_eBury> cuentas_ebury, Direccion direccion) {
        Identificador = identificador;
        Activo = activo;
        Correo = correo;
        this.contrasena = contrasena;
        Telefono = telefono;
        Fecha_apertura = fecha_apertura;
        Fecha_cierre = fecha_cierre;
        this.administrador = administrador;
        this.cuentas_ebury = cuentas_ebury;
        this.direccion = direccion;
    }

    public Cliente() {

    }

    public Cliente(Integer identificador, String activo, String correo, Integer telefono, Date fecha_apertura, Date fecha_cierre, Collection<Cuenta_eBury> cuentas_ebury, Direccion direccion) {
    }

    public Collection<Cuenta_eBury> getCuentas_ebury() {
        return cuentas_ebury;
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

    public void setCuentas_ebury(Collection<Cuenta_eBury> cuentas_ebury) {
        this.cuentas_ebury = cuentas_ebury;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Integer getContrasena() {
        return contrasena;
    }

    public void setContrasena(Integer contrasena) {
        this.contrasena = contrasena;
    }
}
