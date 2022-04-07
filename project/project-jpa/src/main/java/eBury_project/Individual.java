package eBury_project;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Date;

@Entity
public class Individual extends Cliente{


    @Column(nullable = false)
    private String Nombre;
    @Column(nullable = false)
    private String Apellidos;
    @Column(unique=true)
    private String DNI;
    private Date Fecha_nacimiento;
    private String Ocupacion;

    public Individual(Integer identificador, String activo, String correo, Integer telefono, Date fecha_apertura, Date fecha_cierre, Collection<Cuenta_eBury> cuentas_ebury, Direccion direccion, String nombre, String apellidos, String DNI, Date fecha_nacimiento, String ocupacion) {
        super(identificador, activo, correo, telefono, fecha_apertura, fecha_cierre, cuentas_ebury, direccion);
        Nombre = nombre;
        Apellidos = apellidos;
        this.DNI = DNI;
        Fecha_nacimiento = fecha_nacimiento;
        Ocupacion = ocupacion;
    }

    public Individual() {

    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", Fecha_nacimiento=" + Fecha_nacimiento +
                ", Ocupacion='" + Ocupacion + '\'' +
                '}';
    }
}