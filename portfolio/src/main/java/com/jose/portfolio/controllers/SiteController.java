package com.jose.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class SiteController {

    @GetMapping("/")
    public String home(){
        return "/frontend/site/index";
    }

    @GetMapping("/contacto")
    public String contacto(){
        return "/frontend/site/contacto";
    }

    @GetMapping("/curriculum")
    public String curriculum(){
        return "/frontend/site/curriculum";
    }

    @GetMapping("/experiencia")
    public String experiencia(){
        return "/frontend/site/experiencia";
    }

    @GetMapping("/preguntas")
    public String preguntas(){
        return "/frontend/site/preguntas";
    }
}