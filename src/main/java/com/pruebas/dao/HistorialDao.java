package com.pruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.model.Historial;

public interface HistorialDao extends JpaRepository<Historial, Integer>{

}
