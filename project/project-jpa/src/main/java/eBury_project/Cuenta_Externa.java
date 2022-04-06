package eBury_project;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Cuenta_Externa")
public class Cuenta_Externa {
    @Id
    @Column(name = "IBAN", nullable = false)
    private String IBAN;
    private String SWIFT;
    private String beneficiario;
    @OneToMany (mappedBy = "c_ext")
    private List<Externa> externas;

    public Cuenta_Externa(String IBAN, String SWIFT, String beneficiario, List<Externa> externas) {
        this.IBAN = IBAN;
        this.SWIFT = SWIFT;
        this.beneficiario = beneficiario;
        this.externas = externas;
    }

    public Cuenta_Externa() {

    }

    public List<Externa> getExternas() {
		return externas;
	}

	public void setExternas(List<Externa> externas) {
		this.externas = externas;
	}

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