package com.pruebas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.dao.ContactoDao;
import com.pruebas.dao.HistorialDao;
import com.pruebas.dao.PersonaDao;
import com.pruebas.dao.UbicacionDao;
import com.pruebas.model.OrderRequest;
import com.pruebas.model.Persona;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("persona")
public class PersonaRest {
		
	
	@Autowired
	private PersonaDao personaDao;
	
	@Autowired
	private HistorialDao historialDao;
	
	@Autowired 
	private ContactoDao contactoDao;
	
	@Autowired 
	private UbicacionDao ubicacionDao;
	
	
	@PostMapping("/guardarPersona")
	public OrderRequest placeOrder(@RequestBody OrderRequest request) {
		personaDao.save(request.getPersona());
		historialDao.save(request.getHistorial());
		contactoDao.save(request.getContacto());
		ubicacionDao.save(request.getUbicacion());
		return request;
	}
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Persona persona) {
		personaDao.save(persona);
		
	}
	@GetMapping("/listar")
	public List<Persona> listar(){
		return personaDao.findAll();
	}
	@DeleteMapping("/eliminar/{personaId}")
		public void eliminar(@PathVariable("personaId")Integer personaId) {
		personaDao.deleteById(personaId);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Persona persona) {
		personaDao.save(persona);
	}
	
	
	
}
