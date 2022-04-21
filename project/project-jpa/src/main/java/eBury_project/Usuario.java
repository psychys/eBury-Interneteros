package eBury_project;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private boolean administrador;

    public Usuario(int id, boolean administrador) {
        this.id = id;
        this.administrador = administrador;
    }

    public Usuario() {

    }

    @OneToOne (mappedBy ="u_usuario")
    private Cliente c_cliente;

}