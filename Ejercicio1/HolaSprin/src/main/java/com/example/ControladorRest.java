package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j // sirve para que me despliegue en la consola algun mensaje
public class ControladorRest {

  @GetMapping("/")
  public String comienzo() {
    log.info("Estoy ejecutando el controlador REST");
    log.debug("Mas INFO");
    return "Hola mundo en Spring";
  }

}
