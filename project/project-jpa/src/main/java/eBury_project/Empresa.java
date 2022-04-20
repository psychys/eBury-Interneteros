package eBury_project;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import java.util.Collection;
import java.util.Date;

@Entity
public class Empresa extends Cliente{

	@Column(nullable = false)
	private String Razon_Social;


}