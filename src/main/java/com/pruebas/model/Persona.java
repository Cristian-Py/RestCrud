package com.pruebas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer personaId;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column (name = "apePaterno", nullable = false)
	private String apePaterno;
	
	@Column (name = "apeMaterno", nullable = false)
	private String apeMaterno;
	
	@Column(name = "sexo", nullable = false)
	private String sexo;
	
	@Column(name = "fecha", nullable = true)
	private Date fecha;
	
	@Column(name = "curp", nullable = true) 
	private String curp;

	public Integer getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Integer personaId) {
		this.personaId = personaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}
	
}
