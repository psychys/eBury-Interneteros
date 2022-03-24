package eBury_project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue
    private int identificador;
    private String Activo;
    private String correo;
    private int Telefono;
    private String Fecha_apertura;
    private String Fecha_cierre;






}
