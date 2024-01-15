package com.project.tarea2.CoreProject.Repository;

import com.project.tarea2.CoreProject.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

