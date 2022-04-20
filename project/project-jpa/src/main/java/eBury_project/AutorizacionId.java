package eBury_project;

import java.io.Serializable;

public class AutorizacionId implements Serializable {
	
	private int ID_cliente;
	private int ID_autorizado;
	private String tipo;
	
	
	
	public AutorizacionId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getID_cliente() {
		return ID_cliente;
	}
	public void setID_cliente(int iD_cliente) {
		ID_cliente = iD_cliente;
	}
	public int getID_autorizado() {
		return ID_autorizado;
	}
	public void setID_autorizado(int iD_autorizado) {
		ID_autorizado = iD_autorizado;
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
		result = prime * result + ID_autorizado;
		result = prime * result + ID_cliente;
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
		AutorizacionId other = (AutorizacionId) obj;
		if (ID_autorizado != other.ID_autorizado)
			return false;
		if (ID_cliente != other.ID_cliente)
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
		return "AutorizacionId [ID_cliente=" + ID_cliente + ", ID_autorizado="
				+ ID_autorizado + ", tipo=" + tipo + "]";
	}
	
	

}
