package com.pruebas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Historial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer historialId;

	@Column(name = "ultimoEmpleo", nullable = false)
	private String ultimoEmpleo;

	@Column(name = "fechaInicio", nullable = false)
	private Date fechaInicio;

	@Column(name = "fechaFinal", nullable = false)
	private Date fechaFinal;

	@Column(name = "descripcion", nullable = false)
	private String descripcion;

	@OneToOne
	@JoinColumn(name = "personaId")
	private Persona persona;

	public Integer getHistorialId() {
		return historialId;
	}

	public void setHistorialId(Integer historialId) {
		this.historialId = historialId;
	}

	public String getUltimoEmpleo() {
		return ultimoEmpleo;
	}

	public void setUltimoEmpleo(String ultimoEmpleo) {
		this.ultimoEmpleo = ultimoEmpleo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Historial [historialId=" + historialId + ", ultimoEmpleo=" + ultimoEmpleo + ", fechaInicio="
				+ fechaInicio + ", fechaFinal=" + fechaFinal + ", descripcion=" + descripcion + ", persona=" + persona
				+ "]";
	}
	

}
