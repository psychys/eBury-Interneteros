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
    private Date Fecha_nacimiento;

}