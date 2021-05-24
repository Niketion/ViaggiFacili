package it.viaggifacili.controller;

import it.viaggifacili.model.Cliente;
import it.viaggifacili.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class IndexController {

    /*@RequestMapping(value = "/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "/index.html")
    public ModelAndView indexHtml() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "/contact.html")
    public ModelAndView contact() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("contact");
        return mav;
    }

    @RequestMapping(value = "/about.html")
    public ModelAndView about() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("about");
        return mav;
    }

    @RequestMapping(value = "/login.html")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping(value = "/register.html")
    public ModelAndView register() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register");
        return mav;
    }*/
}
