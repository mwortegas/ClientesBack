package com.comohogar.ClientesBack.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class HolaMundoController {
    @GetMapping("/hola")
    public String saludo() {
        return "Hola si funcionó la configuración";
    }
}
