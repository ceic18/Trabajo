package com.reclutamiento.controller;

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
public class InsertController {

	@Autowired
	private PostulanteDAO postulanteDAO;
	
	@RequestMapping(value = "/guardarPostulante", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Postulante postulante) {
		postulanteDAO.guardarPostulante(postulante);
	    return new ModelAndView("redirect:/menu");
	}
	
	@RequestMapping(value = "/guardarInformePostulante", method = RequestMethod.POST)
	public ModelAndView guardarInformePostulante(@ModelAttribute informe_psicologico informe) {
		postulanteDAO.guardarInformePostulante(informe);
	    return new ModelAndView("redirect:/menu");
	}
	
}
