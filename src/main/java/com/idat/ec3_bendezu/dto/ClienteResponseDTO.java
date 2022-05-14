package com.idat.ec3_bendezu.dto;

public class ClienteResponseDTO {
	
	private Integer idCliente;
	private String nombreCliente;
	private Integer celularCliente;
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Integer getCelularCliente() {
		return celularCliente;
	}
	public void setCelularCliente(Integer celularCliente) {
		this.celularCliente = celularCliente;
	}

}
