package eBury_project;

import javax.persistence.*;

@Entity
//@Embeddable
public class Datos {
//preguntar profesor sobre la clave compuesta
    @Id
    @Column(nullable = false)
    private String Tipo_autorizacion;


    public String getTipo_autorizacion() {
        return Tipo_autorizacion;
    }

    public void setTipo_autorizacion(String tipo_autorizacion) {
        Tipo_autorizacion = tipo_autorizacion;
    }


}
