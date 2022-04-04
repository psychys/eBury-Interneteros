package eBury_project;


import java.io.Serializable;

public class Datos_Id implements Serializable {

    private Integer Identificador;
    private String  DNI;

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