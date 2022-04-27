package es.uma.jpa;

import javax.persistence.*;

@Entity
public class DepositadaPooledReferencia {

    @EmbeddedId
    private DepositadaId id;

    @ManyToOne
    @MapsId("iban_pooled")
    @JoinColumn(name = "POOLED")
    private Pooled cuenta_pooled;

    @ManyToOne
    @MapsId("iban_referencia")
    @JoinColumn(name = "REFERENCIA")
    private Cuenta_referencia cuenta_referencia;

    private int saldo;

}
