package it.viaggifacili.example.controller;
/*
import it.viaggifacili.example.model.Nota;
import it.viaggifacili.example.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ViaggiFaciliController {

    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");

        List<Nota> notes = noteService.getAll();

        mav.addObject("note", notes);
        mav.addObject("nota", new Nota());

        return mav;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView add(Nota nota, BindingResult bindingResult) {
        ModelAndView mav = new ModelAndView();

        noteService.saveNota(nota);
        List<Nota> notes = noteService.getAll();

        mav.addObject("note", notes);
        mav.addObject("nota", new Nota());

        mav.setViewName("home");
        return mav;
    }

    @RequestMapping(value = "/edit/{notaId}", method = RequestMethod.GET)
    public ModelAndView update(@PathVariable Integer notaId) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("nota", noteService.findById(notaId));

        mav.setViewName("edit_nota");
        return mav;
    }

    @RequestMapping(value = "/edit/", method = RequestMethod.POST)
    public ModelAndView do_update(Nota nota, BindingResult bindingResult) {
        noteService.saveNota(nota);
        return new ModelAndView("redirect:/");
    }
}*/
