package com.reclutamiento.dao;
import java.util.List;

import com.reclutamiento.bean.Postulante;
import com.reclutamiento.bean.Usuario;


public interface PostulanteDAO {

	public void guardarPostulante(Postulante postulante);
	public Postulante get(String rut);
	public List<Postulante> list();
		
		
	
}
