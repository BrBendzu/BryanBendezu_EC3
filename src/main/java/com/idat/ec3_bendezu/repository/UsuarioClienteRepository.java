package com.idat.ec3_bendezu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ec3_bendezu.model.UsuarioCliente;


@Repository
public interface UsuarioClienteRepository  extends JpaRepository<UsuarioCliente	, Integer>{
	
	UsuarioCliente findByUsuario(String Usuarioliente);

}
