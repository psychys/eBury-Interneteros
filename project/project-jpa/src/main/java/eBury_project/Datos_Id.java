package eBury_project;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class Datos_Id implements Serializable {

    private String Tipo_autorizacion;
    private Integer Identificador;
    private String  DNI;

    
    
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