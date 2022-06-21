package br.univille.petservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.petservices.dto.UsuarioDonoPetDTO;
import br.univille.petservices.service.UsuarioDonoPetService;

@Controller
@RequestMapping("/usuariodonopet")
public class UsuarioDonoPetController {

    @Autowired
    private UsuarioDonoPetService service;

    @GetMapping
    public ModelAndView index(){
        List<UsuarioDonoPetDTO> listaUsuarioDonoPet = service.getAll();
        return new ModelAndView("usuariodonopet/index","listaUsuarioDonoPet", listaUsuarioDonoPet);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        UsuarioDonoPetDTO usuariodonopet = new UsuarioDonoPetDTO();
        return new ModelAndView("usuariodonopet/form", "usuariodonopet", usuariodonopet);
    }

    @PostMapping(params="form")
    public ModelAndView save(UsuarioDonoPetDTO usuariodonopet){
        service.save(usuariodonopet);
        return new ModelAndView("redirect:/home");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable long id){
        UsuarioDonoPetDTO usuariodonopet= service.findById(id);

        return new ModelAndView("usuariodonopet/form", "usuariodonopet", usuariodonopet);
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id){
        service.delete(id);
        return new ModelAndView("redirect:/usuariodonopet");
    }
}
