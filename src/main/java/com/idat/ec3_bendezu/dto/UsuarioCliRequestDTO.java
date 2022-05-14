package com.idat.ec3_bendezu.dto;

public class UsuarioCliRequestDTO {
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UsuarioCliRequestDTO(String token) {
		super();
		this.token = token;
	}
	
	

}
