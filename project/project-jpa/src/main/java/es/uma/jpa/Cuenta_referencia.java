package es.uma.jpa;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

//preguntar si hace falta el mappedBy
@Entity
public class
Cuenta_referencia extends Cuenta{
	
	@Column(nullable = false)
	private String nombre_banco;
	private String sucursal;
	private String pais;
	@Column( nullable = false)
	private int saldo;
	@Temporal(TemporalType.DATE)
	private Date fecha_apertura;
	private String estado;
	@OneToOne(mappedBy ="c_ref")
	private Segregated c_fintech_segregada;
	@ManyToOne
	private Divisa divisa;

	@OneToMany(mappedBy = "cuenta_referencia")
	private Set<DepositadaPooledReferencia> DepositadaReferencia = new HashSet<DepositadaPooledReferencia>();
	
	
	public Cuenta_referencia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre_banco() {
		return nombre_banco;
	}
	public void setNombre_banco(String nombre_banco) {
		this.nombre_banco = nombre_banco;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public Date getFecha_apertura() {
		return fecha_apertura;
	}
	public void setFecha_apertura(Date fecha_apertura) {
		this.fecha_apertura = fecha_apertura;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Segregated getC_fintech_segregada() {
		return c_fintech_segregada;
	}
	public void setC_fintech_segregada(Segregated c_fintech_segregada) {
		this.c_fintech_segregada = c_fintech_segregada;
	}
	public Divisa getDivisa() {
		return divisa;
	}
	public void setDivisa(Divisa divisa) {
		this.divisa = divisa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((c_fintech_segregada == null) ? 0 : c_fintech_segregada
						.hashCode());
		result = prime * result + ((divisa == null) ? 0 : divisa.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((fecha_apertura == null) ? 0 : fecha_apertura.hashCode());
		result = prime * result
				+ ((nombre_banco == null) ? 0 : nombre_banco.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + saldo;
		result = prime * result
				+ ((sucursal == null) ? 0 : sucursal.hashCode());
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
		Cuenta_referencia other = (Cuenta_referencia) obj;
		if (c_fintech_segregada == null) {
			if (other.c_fintech_segregada != null)
				return false;
		} else if (!c_fintech_segregada.equals(other.c_fintech_segregada))
			return false;
		if (divisa == null) {
			if (other.divisa != null)
				return false;
		} else if (!divisa.equals(other.divisa))
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
		if (nombre_banco == null) {
			if (other.nombre_banco != null)
				return false;
		} else if (!nombre_banco.equals(other.nombre_banco))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (saldo != other.saldo)
			return false;
		if (sucursal == null) {
			if (other.sucursal != null)
				return false;
		} else if (!sucursal.equals(other.sucursal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cuenta_referencia [nombre_banco=" + nombre_banco
				+ ", sucursal=" + sucursal + ", pais=" + pais + ", saldo="
				+ saldo + ", fecha_apertura=" + fecha_apertura + ", estado="
				+ estado + ", c_fintech_segregada=" + c_fintech_segregada
				+ ", divisa=" + divisa + "]";
	}
	

	
}
