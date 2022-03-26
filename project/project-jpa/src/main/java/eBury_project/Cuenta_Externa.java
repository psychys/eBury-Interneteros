package eBury_project;

import javax.persistence.*;

@Entity
@Table(name = "Cuenta_Externa")
public class Cuenta_Externa {
    @Id
    @Column(name = "IBAN", nullable = false)
    private String IBAN;
    private String SWIFT;
    private String beneficiario;

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getSWIFT() {
        return SWIFT;
    }

    public void setSWIFT(String SWIFT) {
        this.SWIFT = SWIFT;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
}