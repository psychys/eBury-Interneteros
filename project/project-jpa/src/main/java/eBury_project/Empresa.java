package eBury_project;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Empresa extends Cliente{

	@Column(nullable = false)
	private String Razon_Social;

	@OneToMany(mappedBy = "autorizado")
	private Set<AutorizacionEmpresaAutorizado> empresaAutorizadoSet = new HashSet<AutorizacionEmpresaAutorizado>();


}