package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "*")

public class ControladorRest {
  @Value("${indice.hola}")
  private String hola;

  @GetMapping("")
  public String comienzo(Model model) {
    String saludo = "hola ya funciona no se como se arreglo";
    model.addAttribute("titulo", "titulo ya funciona asi");
    model.addAttribute("cuerpo", "cuerpo ya funciona asi");
    model.addAttribute("saludo", saludo);
    model.addAttribute("hola", hola);

    return "indice";
  }

}
