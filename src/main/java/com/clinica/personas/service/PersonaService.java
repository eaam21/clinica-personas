package com.clinica.personas.service;

import com.clinica.personas.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    List<Persona> getAllPersonas();

    Optional<Persona> getPersonaById(Long idPersona);

    Optional<Persona> getPersonaByDni(String dni);

    Persona createPersona(Persona persona);

    Persona updatePersona(Long idPersona, Persona persona);

    void deletePersona(Long idPersona);
}
