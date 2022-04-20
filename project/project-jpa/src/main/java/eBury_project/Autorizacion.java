package eBury_project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(AutorizacionId.class)
public class Autorizacion {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_empresa" ,referencedColumnName = "ID_empresa")
	private Empresa empresa;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_autorizado" ,referencedColumnName = "ID_Autorizado")
	private Persona_autorizada persona_autorizada;
	
	@Id
	private String tipo;

	public Autorizacion(String id_cliente, String id_autorizado, String tipo) {
		super();
		empresa = empresa;
		persona_autorizada = persona_autorizada;
		this.tipo = tipo;
	}

	public Autorizacion() {

	}

	public Empresa liente() {
		return empresa;
	}

	public void setId_cliente(String id_cliente) {
		empresa = empresa;
	}

	public Persona_autorizada getId_autorizado() {
		return persona_autorizada;
	}

	public void setId_autorizado(String id_autorizado) {
		persona_autorizada = persona_autorizada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((persona_autorizada == null) ? 0 : persona_autorizada.hashCode());
		result = prime * result
				+ ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autorizacion other = (Autorizacion) obj;
		if (persona_autorizada == null) {
			if (other.persona_autorizada != null)
				return false;
		} else if (!persona_autorizada.equals(other.persona_autorizada))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Autorizacion [Id_cliente=" + empresa + ", Id_autorizado="
				+ persona_autorizada + ", tipo=" + tipo + "]";
	}
	
	

}
