package com.reclutamiento.bean;

import java.sql.Date;

public class Prueba {

	int id_prueba;
	int puntaje;
	Date fecha;
	String rut_postulante ;
	byte pruebaConocimiento;
	
	public Prueba(int id_prueba, int puntaje, Date fecha, String rut_postulante, byte pruebaConocimiento) {
		super();
		this.id_prueba = id_prueba;
		this.puntaje = puntaje;
		this.fecha = fecha;
		this.rut_postulante = rut_postulante;
		this.pruebaConocimiento = pruebaConocimiento;
	}

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

	public String getRut_postulante() {
		return rut_postulante;
	}

	public void setRut_postulante(String rut_postulante) {
		this.rut_postulante = rut_postulante;
	}

	public byte getPruebaConocimiento() {
		return pruebaConocimiento;
	}

	public void setPruebaConocimiento(byte pruebaConocimiento) {
		this.pruebaConocimiento = pruebaConocimiento;
	}
	
	
	
}
