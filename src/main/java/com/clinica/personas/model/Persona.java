package com.clinica.personas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="tb_personas")
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_persona")
    private Long idPersona;

    @Column(name="nombres")
    private String nombres;

    @Column(name="apellido_paterno")
    private String apellidoPaterno;

    @Column(name="apellido_materno")
    private String apellidoMaterno;

    @Column(name="dni")
    private String dni;

    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name="direccion")
    private String direccion;

    @Column(name="telefono")
    private String telefono;

    @ManyToOne
    @JoinColumn(name="id_estado_civil")
    private EstadoCivil estadoCivil;

    @ManyToOne
    @JoinColumn(name="id_genero")
    private Genero genero;
}
