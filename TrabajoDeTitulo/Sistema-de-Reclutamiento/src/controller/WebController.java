package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebController {


	@RequestMapping(value = {"/", "/InicioSesion**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

		ModelAndView model = new ModelAndView();
		model.setViewName("InicioSesion");
		return model;

	}
	
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
  @RequestMapping("/ingresarCurriculum")
  public ModelAndView ingresarCurriculum() {
  	
      ModelAndView mav = new ModelAndView();
      mav.setViewName("MenuSecretaria/ingresarCurriculum");

      return mav;
  }
  
  @RequestMapping("/modificarCurriculum")
  public ModelAndView modificarCurriculum() {
	  
	  ModelAndView mav = new ModelAndView();
	  mav.setViewName("MenuSecretaria/modificarCurriculum");
	  
	  return mav;
  }
  
  @RequestMapping("/buscarCurriculum")
  public ModelAndView buscarCurriculum() {
	  
	  ModelAndView mav = new ModelAndView();
	  mav.setViewName("MenuSecretaria/buscarCurriculum");
	  
	  return mav;
  }
  
// Usuario ===================================================
  @RequestMapping("/pruebaConocimiento")
  public ModelAndView pruebaConocimiento() {
  	
      ModelAndView mav = new ModelAndView();
      mav.setViewName("MenuUsuario/pruebaConocimiento");

      return mav;
  }
  @RequestMapping("/verEstado")
  public ModelAndView verEstado() {
	  
	  ModelAndView mav = new ModelAndView();
	  mav.setViewName("MenuUsuario/verEstado");
	  
	  return mav;
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
  
  @RequestMapping("/evaluarPostulante")
  public ModelAndView evaluarPostulante() {
	  
	  ModelAndView mav = new ModelAndView();
	  mav.setViewName("MenuPsicologo/evaluarPostulante");
	  
	  return mav;
  }
  
//    
//    
//    
////    @RequestMapping(method = RequestMethod.POST)
////    public String validar(@RequestParam("rut") String rut, @RequestParam("pass") String pass, Model model) {
////        if (rut.trim().equals("") || pass.trim().equals("")) {
////            return "index";
////            
////        }else{
////            return "menu";
////            
////        }
////    }
//    
////    ========== MENU SECRETARIA ==============
//    
//    @RequestMapping("MenuSecretaria/ingresarCurriculum.htm")
//    public ModelAndView verSecre0() {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("MenuSecretaria/ingresarCurriculum");
//
//        return mav;
//    }
//    @RequestMapping("MenuSecretaria/modificarCurriculum.htm")
//    public ModelAndView verSecre1() {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("MenuSecretaria/modificarCurriculum");
//
//        return mav;
//    }
//    @RequestMapping("MenuSecretaria/buscarCurriculum.htm")
//    public ModelAndView verSecre2() {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("MenuSecretaria/buscarCurriculum");
//
//        return mav;
//    }
//    
////    ===================================
//    
////    ========== MENU PSICOLOGO ==============    
//    
//    @RequestMapping("MenuPsicologo/pruebaPsicologica.htm")
//    public ModelAndView verPsico0() {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("MenuPsicologo/pruebaPsicologica");
//
//        return mav;
//    }
//    @RequestMapping("MenuPsicologo/evaluarPostulante.htm")
//    public ModelAndView verPsico1() {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("MenuPsicologo/evaluarPostulante");
//
//        return mav;
//    }
//
////    ===================================    
//
////    ========== MENU RRHH ==============     
//    
//    @RequestMapping("MenuRRHH/verPostulaciones.htm")
//    public ModelAndView verRRHH() {
//    	
//        ModelAndView mav = new ModelAndView();
//        String sql = "select * from usuarios";
////        List<Map<String, Object>> datos = this.jdbcTemplate.queryForList(sql);
////        mav.addObject("datos", datos);
//        mav.setViewName("MenuRRHH/verPostulaciones");
//
//        return mav;
//    }
//
////    ===================================    
//
////    ========== MENU USUARIOS ==============        
//    
//    @RequestMapping("MenuUsuario/pruebaConocimiento.htm")
//    public ModelAndView verUsers0() {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("MenuUsuario/pruebaConocimiento");
//
//        return mav;
//    }
//    @RequestMapping("MenuUsuario/verEstado.htm")
//    public ModelAndView verUsers1() {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("MenuUsuario/verEstado");
//
//        return mav;
//    }
//    
////    ===================================
//    
//    @RequestMapping("menu.htm")
//    public ModelAndView verMain() {
//    	
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("menu");
//
//        return mav;
//    }
//    
//    @RequestMapping("registrarse.htm")
//    public ModelAndView registro() {
//
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("registrarse");
//
//        return mav;
//    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//   public String login() {
//      return "redirect:menu";
//   }   
}
