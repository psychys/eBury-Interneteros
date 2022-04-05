package eBury_project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
public class Direccion {
    @Id
    private int codigo_postal;
    @Column(nullable = false)
    private String calle;
    @Column(nullable = false)
    private int numero;
    @OneToOne
    private Banco banco;
    @OneToMany (mappedBy = "direccion")
    private List<Cliente> cliente;
    @OneToMany (mappedBy = "direccion")
    private List<Persona_autorizada> p_auth;

    public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Persona_autorizada> getP_auth() {
		return p_auth;
	}

	public void setP_auth(List<Persona_autorizada> p_auth) {
		this.p_auth = p_auth;
	}

	public int getCodigo_postal() {
        return codigo_postal;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}