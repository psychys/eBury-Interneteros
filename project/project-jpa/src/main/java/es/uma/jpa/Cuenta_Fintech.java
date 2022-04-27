package es.uma.jpa;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cuenta_Fintech extends Cuenta{

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date fecha_apertura;
	@Temporal(TemporalType.DATE)
	private Date fecha_cierre;
	private String clasificacion;
	@ManyToOne
	private Cliente cliente;
	
	public Cuenta_Fintech() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuenta_Fintech(String IBAN, String SWIFT, String estado,
						  Date fecha_apertura, Date fecha_cierre, String clasificacion) {
		super(IBAN, SWIFT, estado);
		this.fecha_apertura = fecha_apertura;
		this.fecha_cierre = fecha_cierre;
		this.clasificacion = clasificacion;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Date getFecha_apertura() {
		return fecha_apertura;
	}
	public void setFecha_apertura(Date fecha_apertura) {
		this.fecha_apertura = fecha_apertura;
	}
	public Date getFecha_cierre() {
		return fecha_cierre;
	}
	public void setFecha_cierre(Date fecha_cierre) {
		this.fecha_cierre = fecha_cierre;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Cuenta_Fintech that = (Cuenta_Fintech) o;
		return Objects.equals(fecha_apertura, that.fecha_apertura) && Objects.equals(fecha_cierre, that.fecha_cierre) && Objects.equals(clasificacion, that.clasificacion) && Objects.equals(cliente, that.cliente);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), fecha_apertura, fecha_cierre, clasificacion, cliente);
	}

	@Override
	public String toString() {
		return "Cuenta_Fintech{" +
				"fecha_apertura=" + fecha_apertura +
				", fecha_cierre=" + fecha_cierre +
				", clasificacion='" + clasificacion + '\'' +
				", cliente=" + cliente +
				'}';
	}
}
