package com.reclutamiento.bean;

public class informe_psicologico {

	int id_informe;
	int nota;
	String comentario;
	byte informe_pdf;

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

	public byte getInforme_pdf() {
		return informe_pdf;
	}

	public void setInforme_pdf(byte informe_pdf) {
		this.informe_pdf = informe_pdf;
	}

}
