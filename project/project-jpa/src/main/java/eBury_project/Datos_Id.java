package eBury_project;

import java.io.Serializable;
import java.util.Objects;

public class Datos_Id implements Serializable {


    private Integer Identificador;

    private String  DNI;

    public Datos_Id(Integer identificador, String DNI) {
        Identificador = identificador;
        this.DNI = DNI;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Datos_Id datos_id = (Datos_Id) o;
        return Objects.equals(Identificador, datos_id.Identificador) && Objects.equals(DNI, datos_id.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Identificador, DNI);
    }
}