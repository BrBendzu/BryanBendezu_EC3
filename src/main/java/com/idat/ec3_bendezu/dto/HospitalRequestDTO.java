package com.idat.ec3_bendezu.dto;

public class HospitalRequestDTO {
	
	
	private Integer idHospital;
	private String nombreHospital;
	private String descripcion;
	private String distrito;
	
	public Integer getIdHospital() {
		return idHospital;
	}
	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}
	public String getNombreHospital() {
		return nombreHospital;
	}
	public void setNombreHospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	

}
