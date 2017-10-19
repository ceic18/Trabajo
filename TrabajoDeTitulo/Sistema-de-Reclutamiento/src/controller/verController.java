/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author cesar.ibarra
 */

@Controller
public class verController {
    
    @RequestMapping("ver.htm")
    public ModelAndView ver(){
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName("ver");
        
        return mav;
    }
    
    
    
}
