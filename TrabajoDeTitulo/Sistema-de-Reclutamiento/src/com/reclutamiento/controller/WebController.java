package com.reclutamiento.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.reclutamiento.bean.Postulante;
import com.reclutamiento.dao.PostulanteDAO;


@Controller
public class WebController {

	@Autowired
	private PostulanteDAO postulanteDAO;
//	@RequestMapping(value = {"/", "/InicioSesion**" }, method = RequestMethod.GET)
//	public ModelAndView defaultPage() {
//
//		ModelAndView model = new ModelAndView();
//		model.setViewName("InicioSesion");
//		return model;
//
//	}
//	
	@RequestMapping(value = "/InicioSesion", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

	  ModelAndView model = new ModelAndView();
	  if (error != null) {
		model.addObject("error", "Invalid username and password!");
	  }

	  if (logout != null) {
		model.addObject("msg", "You've been logged out successfully.");
	  }
	  model.setViewName("InicioSesion");

	  return model;

	}
	

//	@RequestMapping(value = "/InicioSesion", method = RequestMethod.GET)
//		public String IniciSesion(ModelMap model) {
//			return "InicioSesion";
//		}
//	
	
	
  @RequestMapping("/menu")
  public ModelAndView Main() {
  	
      ModelAndView mav = new ModelAndView();
      mav.setViewName("menu");

      return mav;
  }
  @RequestMapping("/403")
  public ModelAndView NoAcceso() {
  	
      ModelAndView mav = new ModelAndView();
      mav.setViewName("403");

      return mav;
  }
// Secretaria ================================================
  @RequestMapping("/ingresarPostulante")
  public ModelAndView ingresarPostulante() {
  	
      ModelAndView mav = new ModelAndView();
      mav.setViewName("MenuSecretaria/ingresarPostulante");

      return mav;
  }
  
  @RequestMapping("/buscarPostulante")
  public ModelAndView buscarPostulante() {
	  
	  ModelAndView mav = new ModelAndView();
	  mav.setViewName("MenuSecretaria/buscarPostulante");
	  
	  return mav;
  }
  
// Usuario ===================================================
  @RequestMapping("/verEstado")
  public ModelAndView buscarPostulante(HttpServletRequest request) {
			String rut = request.getParameter("rut");
		    Postulante postulante = postulanteDAO.verEstadoPostulacion(rut);
		    ModelAndView model = new ModelAndView("MenuUsuario/verEstado");
		    model.addObject("postulante", postulante);
		    return model;
  }
  
// RRHH ======================================================
  @RequestMapping("/verPostulaciones")
  public ModelAndView verPostulaciones() {
  	
      ModelAndView mav = new ModelAndView();
      mav.setViewName("MenuRRHH/verPostulaciones");

      return mav;
  }
  
// PSICOLOGO ===========================================
  @RequestMapping("/pruebaPsicologica")
  public ModelAndView pruebaPsicologica() {
  	
      ModelAndView mav = new ModelAndView();
      mav.setViewName("MenuPsicologo/pruebaPsicologica");

      return mav;
  }
  
  @RequestMapping("/buscarInforme")
  public ModelAndView buscarInforme() {
	  
	  ModelAndView mav = new ModelAndView();
	  mav.setViewName("MenuPsicologo/buscarInforme");
	  
	  return mav;
  }
  
}
