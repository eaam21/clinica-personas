package com.clinica.personas.service;

import com.clinica.personas.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    List<Persona> getAllPersonas();

    Optional<Persona> getPersonaById(Long id);

    Persona createPersona(Persona persona);

    Persona updatePersona(Long id, Persona persona);

    void deletePersona(Long id);
}
