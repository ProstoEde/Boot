package com.prostoede.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author prostoede
 */
@RestController
@RequestMapping(value = "/")
public class WebController {
    
     @RequestMapping(value = "/start", method = RequestMethod.GET)
    public ModelAndView getStart(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
    
}
