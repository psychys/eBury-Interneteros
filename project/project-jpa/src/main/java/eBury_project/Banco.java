package eBury_project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Banco {
    @Id
    private String nombre_banco;
    private String tipo_banco;
    @OneToOne
    private Direccion direccion;
    @OneToMany (mappedBy = "banco")
    private List<Cuenta_referencia> c_ref;
    @ManyToOne
    private Pais pais;

    public String getNombre_banco() {
        return nombre_banco;
    }

    public String getTipo_banco() {
        return tipo_banco;
    }

    public void setNombre_banco(String nombre_banco) { this.nombre_banco = nombre_banco; }

    public void setTipo_banco(String tipo_banco) {
        this.tipo_banco = tipo_banco;
    }
}

