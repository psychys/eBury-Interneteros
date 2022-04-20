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
	@JoinColumn(name = "ID_cliente" ,referencedColumnName = "ID_Cliente")
	private String Id_cliente;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ID_autorizado" ,referencedColumnName = "ID_Autorizado")
	private String Id_autorizado;
	
	@Id
	private String tipo;

	public Autorizacion(String id_cliente, String id_autorizado, String tipo) {
		super();
		Id_cliente = id_cliente;
		Id_autorizado = id_autorizado;
		this.tipo = tipo;
	}

	public Autorizacion() {

	}

	public String getId_cliente() {
		return Id_cliente;
	}

	public void setId_cliente(String id_cliente) {
		Id_cliente = id_cliente;
	}

	public String getId_autorizado() {
		return Id_autorizado;
	}

	public void setId_autorizado(String id_autorizado) {
		Id_autorizado = id_autorizado;
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
				+ ((Id_autorizado == null) ? 0 : Id_autorizado.hashCode());
		result = prime * result
				+ ((Id_cliente == null) ? 0 : Id_cliente.hashCode());
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
		if (Id_autorizado == null) {
			if (other.Id_autorizado != null)
				return false;
		} else if (!Id_autorizado.equals(other.Id_autorizado))
			return false;
		if (Id_cliente == null) {
			if (other.Id_cliente != null)
				return false;
		} else if (!Id_cliente.equals(other.Id_cliente))
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
		return "Autorizacion [Id_cliente=" + Id_cliente + ", Id_autorizado="
				+ Id_autorizado + ", tipo=" + tipo + "]";
	}
	
	

}
