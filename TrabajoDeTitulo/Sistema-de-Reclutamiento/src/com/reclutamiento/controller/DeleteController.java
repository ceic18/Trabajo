package com.reclutamiento.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.reclutamiento.bean.Postulante;
import com.reclutamiento.bean.Usuario;
import com.reclutamiento.dao.PostulanteDAO;
import com.reclutamiento.dao.UsuarioDAO;

@Controller
public class DeleteController {

	@Autowired
	private PostulanteDAO postulanteDAO;
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@RequestMapping(value = "/eliminarPostulante", method = RequestMethod.GET)
	public ModelAndView eliminarPostulante(HttpServletRequest request) {
		String rut = request.getParameter("rut");
	    postulanteDAO.eliminarPostulante(rut);
	    return new ModelAndView("redirect:/menu");
	}

	@RequestMapping(value = "/eliminarInforme", method = RequestMethod.GET)
	public ModelAndView eliminarInforme(HttpServletRequest request) {
		String rut_postulante = request.getParameter("rut_postulante");
	    postulanteDAO.eliminarInforme(rut_postulante);
	    return new ModelAndView("redirect:/menu");
	}
	
}
