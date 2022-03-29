package eBury_project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class Pais {
    @Id
    private String abreviatura;
    @Column(nullable = false)
    private String nombre_pais;
    @OneToMany (mappedBy = "pais")
    private List<Banco> banco;
    @ManyToMany(mappedBy = "paises")
    private Collection<Divisa> divisas;

	public List<Banco> getBanco() {
		return banco;
	}

	public void setBanco(List<Banco> banco) {
		this.banco = banco;
	}

	public Collection<Divisa> getDivisas() {
		return divisas;
	}

	public void setDivisas(Collection<Divisa> divisas) {
		this.divisas = divisas;
	}

    public String getAbreviatura() { return abreviatura; }

    public String getNombre_pais() { return nombre_pais; }

    public void setAbreviatura(String abreviatura) { this.abreviatura = abreviatura; }

    public void setNombre_pais(String nombre_pais) { this.nombre_pais = nombre_pais; }

    
}