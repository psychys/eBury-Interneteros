package eBury_project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Pais {
    @Id
    private String abreviatura;
    @Column(nullable = false)
    private String nombre_pais;
    @OneToMany (mappedBy = "pais")
    private List<Banco> banco;
    //@ManyToMany
    //private Divisa divisa;

    public String getAbreviatura() { return abreviatura; }

    public String getNombre_pais() { return nombre_pais; }

    public void setAbreviatura(String abreviatura) { this.abreviatura = abreviatura; }

    public void setNombre_pais(String nombre_pais) { this.nombre_pais = nombre_pais; }
}