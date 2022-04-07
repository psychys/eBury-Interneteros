package eBury_project;

import javax.persistence.*;

@Entity
@IdClass(Datos_Id.class)
public class Datos {
//preguntar profesor sobre la clave compuesta
    
	@Id
	private String Tipo_autorizacion;
    @Id
    private Integer Identificador;
    @Id
    private String DNI;
    
    

    public Integer getIdentificador() {
		return Identificador;
	}

	public void setIdentificador(Integer identificador) {
		Identificador = identificador;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getTipo_autorizacion() {
        return Tipo_autorizacion;
    }

    public void setTipo_autorizacion(String tipo_autorizacion) {
        Tipo_autorizacion = tipo_autorizacion;
    }


}
