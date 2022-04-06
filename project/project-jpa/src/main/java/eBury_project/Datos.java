package eBury_project;

import javax.persistence.*;

@Entity
@IdClass(Datos_Id.class)
public class Datos {
//preguntar profesor sobre la clave compuesta
    @Id
    @Column(nullable = false)
    private String Tipo_autorizacion;

    @Id
    private Integer Identificador;
    @Id
    private String DNI;

    public Datos(String tipo_autorizacion, Integer identificador, String DNI) {
        Tipo_autorizacion = tipo_autorizacion;
        Identificador = identificador;
        this.DNI = DNI;
    }

    public Datos() {

    }

    public String getTipo_autorizacion() {
        return Tipo_autorizacion;
    }

    public void setTipo_autorizacion(String tipo_autorizacion) {
        Tipo_autorizacion = tipo_autorizacion;
    }

    public Integer getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(Integer identificador) {
        Identificador = identificador;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }


}
