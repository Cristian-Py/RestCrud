package com.pruebas.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.security.entity.Rol;
import com.pruebas.security.enums.RolNombre;

public interface RolRepository extends JpaRepository<Rol, Integer>{
	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}