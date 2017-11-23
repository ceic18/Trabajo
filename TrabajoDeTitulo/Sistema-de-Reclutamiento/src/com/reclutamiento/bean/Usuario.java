package com.reclutamiento.bean;

public class Usuario {

	int idusuario;
	String nombre;
	String apellido;
	String clave;
	String rut;
	String cargo;
	
	public Usuario(int idusuario, String nombre, String apellido, String clave, String rut, String cargo) {
		super();
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.rut = rut;
		this.cargo = cargo;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	

}
