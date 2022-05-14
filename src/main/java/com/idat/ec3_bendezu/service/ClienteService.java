package com.idat.ec3_bendezu.service;

import java.util.List;

import com.idat.ec3_bendezu.dto.ClienteRequestDTO;
import com.idat.ec3_bendezu.dto.ClienteResponseDTO;

public interface ClienteService {
	
	public void guardarCliente(ClienteRequestDTO p);
	public void eliminarCliente(Integer id);
	public void editarCliente(ClienteRequestDTO p);
	public List<ClienteResponseDTO> listarCliente();
	public ClienteResponseDTO clienteById(Integer id);

}
