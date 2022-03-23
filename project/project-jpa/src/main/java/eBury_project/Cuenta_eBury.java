package eBury_project;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Cuenta_eBury {
	@Id
	private int n_cuenta;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_alta;
	@Temporal(TemporalType.DATE)
	private Date fecha_baja;
	@Embedded
	private Currency_Account c_account;
	
}
