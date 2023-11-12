package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.Individuo;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "*")
@Slf4j
public class ControladorRest {
  @Value("${indice.hola}")
  private String hola;

  @GetMapping("")
  public String comienzo(Model model) {

    Individuo individuo = new Individuo();
    individuo.setNombre("Nacho");
    individuo.setApellido("Cardozo");
    individuo.setCorreo("ignacio@gmail.com");
    individuo.setTelefono("491865");
    individuo.setEdad("22");

    log.info("Estoy ejecutando el controlador MVC");
    model.addAttribute("titulo", "titulo ya funciona asi");
    model.addAttribute("cuerpo", "cuerpo ya funciona asi");
    model.addAttribute("individuo", individuo);
    model.addAttribute("hola", hola);

    return "indice";
  }

}
