package com.idat.ec3_bendezu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ec3_bendezu.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
