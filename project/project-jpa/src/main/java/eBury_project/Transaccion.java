package eBury_project;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@MappedSuperclass
@Table(name = "transaccion")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Numero_Transaccion", nullable = false)
    private Integer Numero_Transaccion;
    @Temporal(TemporalType.DATE)
    @Column(name= "fecha_realizacion", nullable = false)
    private Date fecha_realizacion;
    @Temporal(TemporalType.DATE)
    @Column(name= "fecha_ejecucion", nullable = false)
    private Date fecha_ejecucion;
    private Integer cantidad_enviada;
    private Integer cantidad_recibida;

	@ManyToMany(mappedBy = "divisas")
    private Collection<Divisa> transacciones;
    @ManyToOne
    private Cuenta_eBury cuenta;

	public Cuenta_eBury getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta_eBury cuenta) {
		this.cuenta = cuenta;
	}
    public Integer getNumero_Transaccion() {
        return Numero_Transaccion;
    }

    public void setNumero_Transaccion(Integer numero_Transaccion) {
        Numero_Transaccion = numero_Transaccion;
    }

    public Date getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(Date fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }

    public Date getFecha_ejecucion() {
        return fecha_ejecucion;
    }

    public void setFecha_ejecucion(Date fecha_ejecucion) {
        this.fecha_ejecucion = fecha_ejecucion;
    }

    public Integer getCantidad_enviada() {
        return cantidad_enviada;
    }

    public void setCantidad_enviada(Integer cantidad_enviada) {
        this.cantidad_enviada = cantidad_enviada;
    }

    public Integer getCantidad_recibida() {
        return cantidad_recibida;
    }

    public void setCantidad_recibida(Integer cantidad_recibida) {
        this.cantidad_recibida = cantidad_recibida;
    }

    public Collection<Divisa> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Collection<Divisa> transacciones) {
        this.transacciones = transacciones;
    }

    

}