package eBury_project;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable

public class Interna {
    @Column(name= "Comision", nullable = false)
    private double Comision;
    @ManyToOne
    private Cuenta_eBury cuenta;
}
