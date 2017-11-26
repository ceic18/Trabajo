package com.reclutamiento.dao;
import java.util.List;

import com.reclutamiento.bean.Postulante;
import com.reclutamiento.bean.Usuario;
import com.reclutamiento.bean.informe_psicologico;


public interface PostulanteDAO {

	//FUNCIONES SECRETARIA
	public void guardarPostulante(Postulante postulante);
	public Postulante get(String rut);
	public List<Postulante> list();
	public void eliminarPostulante(String rut);
	public void guardarCambiosPostulante(Postulante postulante);
	public Postulante modificarPostulante(String rut);
		
	//FUNCIONES PSICOLOGO
	public void guardarInformePostulante(informe_psicologico informe);
	public informe_psicologico modificarInforme(String rut_postulante);
	public void guardarCambiosInforme(informe_psicologico informe);
	public informe_psicologico searchInforme(String rut_postulante);
	public void eliminarInforme(String rut_postulante);
	
	//FUNCIONES RRHH
	public void elegirCandidato();
	public List<Postulante> mejoresCandidatos();
	public void rechazarCandidato();
	public void ordenarCandidatos(String Accion);
	public List<Postulante> listaTodos();
	
	//FUNCIONES USUARIO
	public Postulante verEstadoPostulacion(String rut);
}
