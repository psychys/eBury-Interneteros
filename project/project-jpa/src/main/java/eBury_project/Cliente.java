package eBury_project;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Cliente {

    @Id @GeneratedValue
    private int ID;
    @Column(unique = true)
    private int Identificacion;
    @Column(nullable = false)
    private String tipo_cliente;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date Fecha_Alta;
    @Temporal(TemporalType.DATE)
    private Date Fecha_Baja;
    @Column(nullable = false)
    private String Direccion;
    @Column(nullable = false)
    private String Ciudad;
    @Column(nullable = false)
    private int c_postal;
    @Column(nullable = false)
    private String Pais;
    
    @OneToMany //(mappedBy = "banco")
    @JoinTable(name = "cliente_fintech", 
	joinColumns = @JoinColumn(name = "Id_cliente"), 
	inverseJoinColumns = @JoinColumn(name = "fintech_iban"))
    private List<Cuenta_Fintech> c_fintech;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getIdentificacion() {
		return Identificacion;
	}

	public void setIdentificacion(int identificacion) {
		Identificacion = identificacion;
	}

	public String getTipo_cliente() {
		return tipo_cliente;
	}

	public void setTipo_cliente(String tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}

	public Date getFecha_Alta() {
		return Fecha_Alta;
	}

	public void setFecha_Alta(Date fecha_Alta) {
		Fecha_Alta = fecha_Alta;
	}

	public Date getFecha_Baja() {
		return Fecha_Baja;
	}

	public void setFecha_Baja(Date fecha_Baja) {
		Fecha_Baja = fecha_Baja;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public int getC_postal() {
		return c_postal;
	}

	public void setC_postal(int c_postal) {
		this.c_postal = c_postal;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public List<Cuenta_Fintech> getC_fintech() {
		return c_fintech;
	}

	public void setC_fintech(List<Cuenta_Fintech> c_fintech) {
		this.c_fintech = c_fintech;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Ciudad == null) ? 0 : Ciudad.hashCode());
		result = prime * result
				+ ((Direccion == null) ? 0 : Direccion.hashCode());
		result = prime * result
				+ ((Fecha_Alta == null) ? 0 : Fecha_Alta.hashCode());
		result = prime * result
				+ ((Fecha_Baja == null) ? 0 : Fecha_Baja.hashCode());
		result = prime * result + ID;
		result = prime * result + Identificacion;
		result = prime * result + ((Pais == null) ? 0 : Pais.hashCode());
		result = prime * result
				+ ((c_fintech == null) ? 0 : c_fintech.hashCode());
		result = prime * result + c_postal;
		result = prime * result
				+ ((tipo_cliente == null) ? 0 : tipo_cliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (Ciudad == null) {
			if (other.Ciudad != null)
				return false;
		} else if (!Ciudad.equals(other.Ciudad))
			return false;
		if (Direccion == null) {
			if (other.Direccion != null)
				return false;
		} else if (!Direccion.equals(other.Direccion))
			return false;
		if (Fecha_Alta == null) {
			if (other.Fecha_Alta != null)
				return false;
		} else if (!Fecha_Alta.equals(other.Fecha_Alta))
			return false;
		if (Fecha_Baja == null) {
			if (other.Fecha_Baja != null)
				return false;
		} else if (!Fecha_Baja.equals(other.Fecha_Baja))
			return false;
		if (ID != other.ID)
			return false;
		if (Identificacion != other.Identificacion)
			return false;
		if (Pais == null) {
			if (other.Pais != null)
				return false;
		} else if (!Pais.equals(other.Pais))
			return false;
		if (c_fintech == null) {
			if (other.c_fintech != null)
				return false;
		} else if (!c_fintech.equals(other.c_fintech))
			return false;
		if (c_postal != other.c_postal)
			return false;
		if (tipo_cliente == null) {
			if (other.tipo_cliente != null)
				return false;
		} else if (!tipo_cliente.equals(other.tipo_cliente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [ID=" + ID + ", Identificacion=" + Identificacion
				+ ", tipo_cliente=" + tipo_cliente + ", Fecha_Alta="
				+ Fecha_Alta + ", Fecha_Baja=" + Fecha_Baja + ", Direccion="
				+ Direccion + ", Ciudad=" + Ciudad + ", c_postal=" + c_postal
				+ ", Pais=" + Pais + ", c_fintech=" + c_fintech + "]";
	}
    
    
    
}
