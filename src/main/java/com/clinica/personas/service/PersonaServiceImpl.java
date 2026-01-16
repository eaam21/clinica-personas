package com.clinica.personas.service;

import com.clinica.personas.model.Persona;
import com.clinica.personas.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> getPersonaById(Long idPersona) {
        return personaRepository.findById(idPersona);
    }

    @Override
    public Persona createPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona updatePersona(Long idPersona, Persona persona) {
        if (personaRepository.existsById(idPersona)) {
            persona.setIdPersona(idPersona);
            return personaRepository.save(persona);
        }
        return null;
    }

    @Override
    public void deletePersona(Long idPersona) {
        personaRepository.deleteById(idPersona);
    }
}
