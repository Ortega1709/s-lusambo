package com.ortega.slusambo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class SLusamboController {

    @GetMapping("/info")
    public String index() {
        return "Serveur de Lusambo";
    }

}
