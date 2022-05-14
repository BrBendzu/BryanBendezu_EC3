package com.idat.ec3_bendezu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec3_bendezu.dto.ClienteRequestDTO;
import com.idat.ec3_bendezu.dto.ClienteResponseDTO;
import com.idat.ec3_bendezu.model.Cliente;
import com.idat.ec3_bendezu.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public void guardarCliente(ClienteRequestDTO p) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCelular(p.getCelularCliente());
		cliente.setNombre(p.getNombreCliente());
		cliente.setIdCliente(p.getIdCliente());
		repository.save(cliente);
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public void editarCliente(ClienteRequestDTO p) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setIdCliente(p.getIdCliente());
		cliente.setCelular(p.getCelularCliente());
		cliente.setNombre(p.getNombreCliente());
		repository.saveAndFlush(cliente);
		
	}

	@Override
	public List<ClienteResponseDTO> listarCliente() {
		
		List<Cliente>cliente = repository.findAll();
		
		List<ClienteResponseDTO>dto= new ArrayList<ClienteResponseDTO>();
		ClienteResponseDTO clienteDTO= null;
		
		for(Cliente clientes: cliente) {
			clienteDTO= new ClienteResponseDTO();
			clienteDTO.setIdCliente(clientes.getIdCliente());
			clienteDTO.setNombreCliente(clientes.getNombre());
			clienteDTO.setCelularCliente(clientes.getCelular());
			dto.add(clienteDTO);
			
		}
		
		return dto;
	}

	@Override
	public ClienteResponseDTO clienteById(Integer id) {
		Cliente cliente = repository.findById(id).orElse(null);
		ClienteResponseDTO clienteDTO = new ClienteResponseDTO();
		
		clienteDTO= new ClienteResponseDTO();
		clienteDTO.setIdCliente(cliente.getIdCliente());
		clienteDTO.setNombreCliente(cliente.getNombre());
		clienteDTO.setCelularCliente(cliente.getCelular());
		
		return clienteDTO;
		
		
	}

}
