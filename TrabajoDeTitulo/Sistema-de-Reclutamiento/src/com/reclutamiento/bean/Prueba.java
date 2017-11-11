package com.reclutamiento.bean;

import java.sql.Date;

public class Prueba {

	int id_prueba;
	int puntaje;
	Date fecha;
	int pregunta;
	int respuesta;

	public int getId_prueba() {
		return id_prueba;
	}

	public void setId_prueba(int id_prueba) {
		this.id_prueba = id_prueba;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getPregunta() {
		return pregunta;
	}

	public void setPregunta(int pregunta) {
		this.pregunta = pregunta;
	}

	public int getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}

}
