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
import com.reclutamiento.dao.PostulanteDAO;
import com.reclutamiento.dao.UsuarioDAO;


@Controller
public class SearchController {

	@Autowired
	private PostulanteDAO postulanteDAO;
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
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
	
//	@RequestMapping(value="/")
//	public ModelAndView listaPostulantes(ModelAndView model) throws IOException{
//	    List<Postulante> listContact = postulanteDAO.list();
//	    model.addObject("listContact", listContact);
//	    model.setViewName("home");
//	 
//	    return model;
//	}

}
