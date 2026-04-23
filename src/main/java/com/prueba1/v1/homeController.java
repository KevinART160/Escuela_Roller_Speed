package com.prueba1.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class homeController {
    @GetMapping("/")
    public String Inicio() {
        return "index";
    }
     @GetMapping("/mision")
    public String Mision() {
        return "mision";
    }
     @GetMapping("/vision")
    public String Vision() {
        return "vision";
    }
     @GetMapping("/servicios")
    public String Servicios() {
        return "servicios";
    }
     @GetMapping("/valores")
    public String Valores() {
        return "valores";
    }
     @GetMapping("/eventos")
    public String Eventos() {
        return "eventos";
    }
    
}
