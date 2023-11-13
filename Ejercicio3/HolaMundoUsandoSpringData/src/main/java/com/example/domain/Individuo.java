package com.example.domain;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;

@Data // nos ahorra al hacer el get y set de estos atributos
@Entity
@Table(name = "individuo")
public class Individuo implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id_individuo;
  private String nombre;
  private String apellido;
  private String telefono;
  private String correo;
  private String edad;
}
