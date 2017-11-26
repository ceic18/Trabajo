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
import com.reclutamiento.bean.informe_psicologico;
import com.reclutamiento.dao.PostulanteDAO;
import com.reclutamiento.dao.UsuarioDAO;

@Controller
public class ModifyController {

	@Autowired
	private PostulanteDAO postulanteDAO;
	
	@RequestMapping(value = "/guardarCambiosPostulante", method = RequestMethod.POST)
	public ModelAndView guardaModificaciones(@ModelAttribute Postulante postulante) {
		postulanteDAO.guardarCambiosPostulante(postulante);
	    return new ModelAndView("redirect:/menu");
	}
	
	@RequestMapping(value = "/modificarPostulante", method = RequestMethod.GET)
	public ModelAndView searchPostulante(HttpServletRequest request) {
	    String rut = request.getParameter("rut");
	    Postulante postulante = postulanteDAO.modificarPostulante(rut);
	    ModelAndView model = new ModelAndView("MenuSecretaria/modificarPostulanteDatos");
	    model.addObject("postulante", postulante);
	    return model;
	}
	
	
	@RequestMapping(value = "/modificarInforme", method = RequestMethod.GET)
	public ModelAndView modificarInforme(HttpServletRequest request) {
	    String rut_postulante = request.getParameter("rut_postulante");
	    informe_psicologico informe = postulanteDAO.modificarInforme(rut_postulante);
	    ModelAndView model = new ModelAndView("MenuPsicologo/modificarInformeDatos");
	    model.addObject("informe", informe);
	    return model;
	}
	
	@RequestMapping(value = "/guardarCambiosInforme", method = RequestMethod.POST)
	public ModelAndView guardarCambiosInforme(@ModelAttribute informe_psicologico informe) {
		postulanteDAO.guardarCambiosInforme(informe);
	    return new ModelAndView("redirect:/menu");
	}
	
}
