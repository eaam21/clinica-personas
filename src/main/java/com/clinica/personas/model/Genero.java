package com.clinica.personas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tb_genero")
@Data
public class Genero {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_genero")
    private Long idGenero;

    @Column(name="nombre")
    private String nombre;
}
