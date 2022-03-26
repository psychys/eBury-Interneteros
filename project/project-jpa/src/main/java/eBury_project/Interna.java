package eBury_project;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class Interna {
    @Column(name= "Comision", nullable = false)
    private double Comision;
}
