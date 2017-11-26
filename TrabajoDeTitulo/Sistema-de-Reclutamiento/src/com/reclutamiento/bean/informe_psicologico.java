package com.reclutamiento.bean;

public class informe_psicologico {

	int id_informe;
	int nota;
	String comentario;
	byte informePDF;
	String rut_postulante;
	
	
	public informe_psicologico() {
		super();
	}

	public informe_psicologico(int id_informe, int nota, String comentario, byte informePDF, String rut_postulante) {
		super();
		this.id_informe = id_informe;
		this.nota = nota;
		this.comentario = comentario;
		this.informePDF = informePDF;
		this.rut_postulante = rut_postulante;
	}
	
	public int getId_informe() {
		return id_informe;
	}
	public void setId_informe(int id_informe) {
		this.id_informe = id_informe;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public byte getInformePDF() {
		return informePDF;
	}
	public void setInformePDF(byte informePDF) {
		this.informePDF = informePDF;
	}
	public String getRut_postulante() {
		return rut_postulante;
	}
	public void setRut_postulante(String rut_postulante) {
		this.rut_postulante = rut_postulante;
	}
	
}
