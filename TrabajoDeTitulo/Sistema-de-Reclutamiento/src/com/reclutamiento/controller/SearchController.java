package com.reclutamiento.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.reclutamiento.bean.Postulante;
import com.reclutamiento.bean.Usuario;
import com.reclutamiento.bean.informe_psicologico;
import com.reclutamiento.dao.PostulanteDAO;
import com.reclutamiento.dao.UsuarioDAO;


@Controller
public class SearchController {

	@Autowired
	private PostulanteDAO postulanteDAO;
	
	@RequestMapping(value = "/searchPostulante", method = RequestMethod.POST)
	public ModelAndView searchPostulante(HttpServletRequest request) {
	    String rut = request.getParameter("rut");
	    Postulante postulante = postulanteDAO.get(rut);
	    ModelAndView model = new ModelAndView("MenuSecretaria/buscarPostulanteDatos");
	    model.addObject("postulante", postulante);
	    return model;
	}
	
	@RequestMapping(value="/listaPostulante")
	public ModelAndView listaPostulantes(ModelAndView model) throws IOException{
		List<Postulante> listaPostulantes = postulanteDAO.list();
		model.addObject("listaPostulantes", listaPostulantes);
		model.setViewName("MenuSecretaria/listaPostulante");
		return model;
	}
	
	@RequestMapping(value = "/searchInforme", method = RequestMethod.POST)
	public ModelAndView searchInforme(HttpServletRequest request) {
	    String rut_postulante = request.getParameter("rut_postulante");
	    informe_psicologico informe = postulanteDAO.searchInforme(rut_postulante);
	    ModelAndView model = new ModelAndView("MenuPsicologo/buscarInformeDatos");
	    model.addObject("informe", informe);
	    return model;
	}	
	

}
