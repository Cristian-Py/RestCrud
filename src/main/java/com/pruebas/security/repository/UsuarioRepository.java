package com.pruebas.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.pruebas.security.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findNombreUsuario(String nombreUsuario);
	boolean existsByNombreUsuario(String nombreUsuario);
	boolean existByEmail(String email);

}
