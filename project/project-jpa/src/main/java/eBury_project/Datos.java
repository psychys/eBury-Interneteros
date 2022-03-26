package eBury_project;

import javax.persistence.*;

@Entity
@Embeddable
public class Datos {

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
