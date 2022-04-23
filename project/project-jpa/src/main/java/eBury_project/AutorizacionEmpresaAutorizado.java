package eBury_project;

import javax.persistence.*;

@Entity
public class AutorizacionEmpresaAutorizado {

    @EmbeddedId
    private AutorizacionId id;

    @ManyToOne
    @MapsId("ID_Empresa")
    @JoinColumn(name = "EMPRESA_ID")
    private Empresa empresa;

    @ManyToOne
    @MapsId("ID_autorizado")
    @JoinColumn(name = "AUTORIZADO_ID")
    private Persona_autorizada autorizado;

    private String tipo;





}
