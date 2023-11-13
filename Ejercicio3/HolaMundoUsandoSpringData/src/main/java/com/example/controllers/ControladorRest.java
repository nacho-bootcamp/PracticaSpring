package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "*")
@Slf4j
public class ControladorRest {

  @GetMapping("")
  public String comienzo(Model model) {
    log.info("Estoy ejecutando el controlador MVC");
    // model.addAttribute("individuos", individuos);
    return "indice";
  }

}
