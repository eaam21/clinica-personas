package com.clinica.personas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tb_estado_civil")
@Data
public class EstadoCivil {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_estado")
    private Long idEstadoCivil;

    @Column(name="nombre")
    private String nombre;
}
