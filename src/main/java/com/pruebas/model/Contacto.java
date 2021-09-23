package com.pruebas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Contacto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer contactoId; 
	
	@Column(name = "telefono", nullable = false)
	private String telefono;
	
	@Column(name = "tipo", nullable = true)
	private String tipo;
	
	@OneToOne
	@JoinColumn(name = "personaId")
	private Persona persona;

	public Integer getContactoId() {
		return contactoId;
	}

	public void setContactoId(Integer contactoId) {
		this.contactoId = contactoId;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Contacto [contactoId=" + contactoId + ", telefono=" + telefono + ", tipo=" + tipo + ", persona="
				+ persona + "]";
	}
	
	
}
