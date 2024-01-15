package com.project.tarea2.CoreProject.Service;

import com.project.tarea2.CoreProject.Entity.Persona;
import com.project.tarea2.CoreProject.Entity.ProjectPeople;
import com.project.tarea2.CoreProject.Repository.ProjectPeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectPeopleService {

    private final ProjectPeopleRepository projectPeopleRepository;


    @Autowired
    public ProjectPeopleService(ProjectPeopleRepository projectPeopleRepository) {
        this.projectPeopleRepository = projectPeopleRepository;
    }

    public List<ProjectPeople> getAllProjectPeople() {
        return projectPeopleRepository.findAll();
    }

    public ProjectPeople getProjectPeopleById(Long projectPeopleId) {
        return projectPeopleRepository.findById(projectPeopleId).orElse(null);
    }

    public List<ProjectPeople> getParticipantsByProjectId(Long projectId) {
        return projectPeopleRepository.findByProjectId(projectId);
    }

    public Persona getDirectorByProjectId(Long projectId) {
        // Utilizar el repositorio para buscar al director de un proyecto específico
        ProjectPeople director = projectPeopleRepository.findDirectorByProjectId(projectId);

        if (director != null) {
            return director.getPerson();
        }

        return null;
    }



}

