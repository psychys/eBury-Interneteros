package es.uma.jpa;

import javax.persistence.*;

import java.util.List;

//Entidad debil con saldo

@Entity
@Table(name = "divisa")
public class Divisa {
    @Id
    private String abreviatura;
    @Column(nullable = false)
    private String nombre;
    private String simbolo;
    @Column (nullable = false)
    private double cambio_euro;
    
    @OneToMany (mappedBy = "emisor")
    @JoinTable(name = "divisa_emisor", 
	joinColumns = @JoinColumn(name = "divisa"), 
	inverseJoinColumns = @JoinColumn(name = "id_trans"))
    private List<Transaccion> trans_emsior;
    
    @OneToMany (mappedBy = "receptor")
    @JoinTable(name = "divisa_receptor", 
	joinColumns = @JoinColumn(name = "divisa"), 
	inverseJoinColumns = @JoinColumn(name = "id_trans"))
    private List<Transaccion> trans_receptor;

	@OneToMany (mappedBy = "divisa")
	@JoinTable(name = "divisa_cref",
	joinColumns = @JoinColumn(name = "divisa"),
	inverseJoinColumns = @JoinColumn(name = "c_ref"))
	private List<Cuenta_referencia> c_ref;
    
    

    public List<Transaccion> getTrans_emsior() {
		return trans_emsior;
	}




	public void setTrans_emsior(List<Transaccion> trans_emsior) {
		this.trans_emsior = trans_emsior;
	}




	public List<Transaccion> getTrans_receptor() {
		return trans_receptor;
	}




	public void setTrans_receptor(List<Transaccion> trans_receptor) {
		this.trans_receptor = trans_receptor;
	}




	public String getAbreviatura() {
		return abreviatura;
	}




	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getSimbolo() {
		return simbolo;
	}




	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}




	public double getCambio_euro() {
		return cambio_euro;
	}




	public void setCambio_euro(double cambio_euro) {
		this.cambio_euro = cambio_euro;
	}




	public Divisa() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Divisa(String abreviatura, String nombre, String simbolo, double cambio_euro) {
		this.abreviatura = abreviatura;
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.cambio_euro = cambio_euro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abreviatura == null) ? 0 : abreviatura.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cambio_euro);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((simbolo == null) ? 0 : simbolo.hashCode());
		result = prime * result
				+ ((trans_emsior == null) ? 0 : trans_emsior.hashCode());
		result = prime * result
				+ ((trans_receptor == null) ? 0 : trans_receptor.hashCode());
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
		Divisa other = (Divisa) obj;
		if (abreviatura == null) {
			if (other.abreviatura != null)
				return false;
		} else if (!abreviatura.equals(other.abreviatura))
			return false;
		if (Double.doubleToLongBits(cambio_euro) != Double
				.doubleToLongBits(other.cambio_euro))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (simbolo == null) {
			if (other.simbolo != null)
				return false;
		} else if (!simbolo.equals(other.simbolo))
			return false;
		if (trans_emsior == null) {
			if (other.trans_emsior != null)
				return false;
		} else if (!trans_emsior.equals(other.trans_emsior))
			return false;
		if (trans_receptor == null) {
			if (other.trans_receptor != null)
				return false;
		} else if (!trans_receptor.equals(other.trans_receptor))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Divisa [abreviatura=" + abreviatura + ", nombre=" + nombre
				+ ", simbolo=" + simbolo + ", cambio_euro=" + cambio_euro
				+ ", trans_emsior=" + trans_emsior + ", trans_receptor="
				+ trans_receptor + "]";
	}




	//Preguntar si con esto cumple el requisito cambio de divisa
    public double cambiodivisa(double cantidad_euros){
        return cantidad_euros*cambio_euro;
    }
}