package com.project.tarea2.CoreProject.Service;

import com.project.tarea2.CoreProject.Entity.Persona;
import com.project.tarea2.CoreProject.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    public Persona getPersonaById(Long personaId) {
        return personaRepository.findById(personaId).orElse(null);
    }

}
