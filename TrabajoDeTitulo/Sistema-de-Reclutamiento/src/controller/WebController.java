package controller;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import modelo.Conectar;


@Controller
//@RequestMapping("/menu.htm")
public class WebController {

//	private JdbcTemplate jdbcTemplate;
//	
//	public WebController() {
//		Conectar con = new Conectar();
//		this.jdbcTemplate = new JdbcTemplate(con.conectar());
//	}
	
    @RequestMapping(method = RequestMethod.GET)
    public String Forzar(Model model) {
        return "index";
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public String validar(@RequestParam("rut") String rut, @RequestParam("pass") String pass, Model model) {
//        if (rut.trim().equals("") || pass.trim().equals("")) {
//            return "index";
//            
//        }else{
//            return "menu";
//            
//        }
//    }
    
//    ========== MENU SECRETARIA ==============
    
    @RequestMapping("MenuSecretaria/ingresarCurriculum.htm")
    public ModelAndView verSecre0() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("MenuSecretaria/ingresarCurriculum");

        return mav;
    }
    @RequestMapping("MenuSecretaria/modificarCurriculum.htm")
    public ModelAndView verSecre1() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("MenuSecretaria/modificarCurriculum");

        return mav;
    }
    @RequestMapping("MenuSecretaria/buscarCurriculum.htm")
    public ModelAndView verSecre2() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("MenuSecretaria/buscarCurriculum");

        return mav;
    }
    
//    ===================================
    
//    ========== MENU PSICOLOGO ==============    
    
    @RequestMapping("MenuPsicologo/pruebaPsicologica.htm")
    public ModelAndView verPsico0() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("MenuPsicologo/pruebaPsicologica");

        return mav;
    }
    @RequestMapping("MenuPsicologo/evaluarPostulante.htm")
    public ModelAndView verPsico1() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("MenuPsicologo/evaluarPostulante");

        return mav;
    }

//    ===================================    

//    ========== MENU RRHH ==============     
    
    @RequestMapping("MenuRRHH/verPostulaciones.htm")
    public ModelAndView verRRHH() {
    	
        ModelAndView mav = new ModelAndView();
        String sql = "select * from usuarios";
//        List<Map<String, Object>> datos = this.jdbcTemplate.queryForList(sql);
//        mav.addObject("datos", datos);
        mav.setViewName("MenuRRHH/verPostulaciones");

        return mav;
    }

//    ===================================    

//    ========== MENU USUARIOS ==============        
    
    @RequestMapping("MenuUsuario/pruebaConocimiento.htm")
    public ModelAndView verUsers0() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("MenuUsuario/pruebaConocimiento");

        return mav;
    }
    @RequestMapping("MenuUsuario/verEstado.htm")
    public ModelAndView verUsers1() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("MenuUsuario/verEstado");

        return mav;
    }
    
//    ===================================
    
    @RequestMapping("menu.htm")
    public ModelAndView verMain() {
    	
        ModelAndView mav = new ModelAndView();
        mav.setViewName("menu");

        return mav;
    }
    
    @RequestMapping("registrarse.htm")
    public ModelAndView registro() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("registrarse");

        return mav;
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//   public String login() {
//      return "redirect:menu";
//   }   
}
