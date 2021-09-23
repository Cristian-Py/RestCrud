package com.pruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.model.Contacto;

public interface ContactoDao extends JpaRepository<Contacto, Integer>{
	
}
