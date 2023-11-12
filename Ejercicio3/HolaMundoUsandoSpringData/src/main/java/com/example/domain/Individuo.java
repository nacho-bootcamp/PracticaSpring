package com.example.domain;

import lombok.Data;

@Data // nos ahorra al hacer el get y set de estos atributos
public class Individuo {
  private String nombre;
  private String apellido;
  private String telefono;
  private String correo;
  private String edad;
}
