package eBury_project;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cuenta_Finetch extends Cuenta{
	
	@Column(nullable = false)
	private String estado;
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date fecha_apertura;
	@Temporal(TemporalType.DATE)
	private Date fecha_cierre;
	private String clasificacion;
	@ManyToOne
	private Cliente cliente;
	
	public Cuenta_Finetch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((clasificacion == null) ? 0 : clasificacion.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fecha_apertura == null) ? 0 : fecha_apertura.hashCode());
		result = prime * result
				+ ((fecha_cierre == null) ? 0 : fecha_cierre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta_Finetch other = (Cuenta_Finetch) obj;
		if (clasificacion == null) {
			if (other.clasificacion != null)
				return false;
		} else if (!clasificacion.equals(other.clasificacion))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fecha_apertura == null) {
			if (other.fecha_apertura != null)
				return false;
		} else if (!fecha_apertura.equals(other.fecha_apertura))
			return false;
		if (fecha_cierre == null) {
			if (other.fecha_cierre != null)
				return false;
		} else if (!fecha_cierre.equals(other.fecha_cierre))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Cuenta_Finetch [estado=" + estado + ", fecha_apertura="
				+ fecha_apertura + ", fecha_cierre=" + fecha_cierre
				+ ", clasificacion=" + clasificacion + ", cliente=" + cliente
				+ "]";
	}
	
	
	
	
	

}
