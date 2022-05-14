package com.idat.ec3_bendezu.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="cliente")
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private Integer celular;
	
	
	
	@OneToOne(mappedBy = "cliente")
	private UsuarioCliente usuariocliente;
	
	
	@ManyToMany(mappedBy = "clientes",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Hospital>hospitales= new ArrayList<>();



	public Integer getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getCelular() {
		return celular;
	}



	public void setCelular(Integer celular) {
		this.celular = celular;
	}



	public UsuarioCliente getUsuariocliente() {
		return usuariocliente;
	}



	public void setUsuariocliente(UsuarioCliente usuariocliente) {
		this.usuariocliente = usuariocliente;
	}



	public List<Hospital> getHospitales() {
		return hospitales;
	}



	public void setHospitales(List<Hospital> hospitales) {
		this.hospitales = hospitales;
	}
	
	
	
	
	

}
