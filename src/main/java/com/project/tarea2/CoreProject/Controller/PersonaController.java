package com.project.tarea2.CoreProject.Controller;

import com.project.tarea2.CoreProject.Entity.Persona;
import com.project.tarea2.CoreProject.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> getAllPersonas() {
        return personaService.getAllPersonas();
    }

    @GetMapping("/{personaId}")
    public Persona getPersonaById(@PathVariable Long personaId) {
        return personaService.getPersonaById(personaId);
    }

}

