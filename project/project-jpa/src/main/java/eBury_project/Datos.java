package eBury_project;

import javax.persistence.*;

@Entity
@IdClass(Datos_Id.class)
public class Datos {
//preguntar profesor sobre la clave compuesta

    
	@Id
	
	private String Tipo_autorizacion;
    @Id
    @ManyToOne
	@JoinColumn(name = "datos_empresa" ,referencedColumnName = "Identificador")
    private Empresa Identificador;
    @Id
    @ManyToOne
	@JoinColumn(name = "datos_persona_autorizada" ,referencedColumnName = "DNI")
    private Persona_autorizada DNI;
    
    


	public String getTipo_autorizacion() {
        return Tipo_autorizacion;
    }

    public void setTipo_autorizacion(String tipo_autorizacion) {
        Tipo_autorizacion = tipo_autorizacion;
    }

    public Empresa getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(Empresa identificador) {
        Identificador = identificador;
    }

    public Persona_autorizada getDNI() {
        return DNI;
    }

    public void setDNI(Persona_autorizada DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "Tipo_autorizacion='" + Tipo_autorizacion + '\'' +
                ", Identificador=" + Identificador +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
