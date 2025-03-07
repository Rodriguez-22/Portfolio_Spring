package com.jose.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class ContactoController {
    
    @GetMapping("/contacto/contactoIndex")
    public String getAll(){
        return "/frontend/contacto/contactoIndex";
    }
}
