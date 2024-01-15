package com.project.tarea2.CoreProject.Controller;

import com.project.tarea2.CoreProject.Entity.ProjectPeople;
import com.project.tarea2.CoreProject.Service.ProjectPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project-people")
public class ProjectPeopleController {

    private final ProjectPeopleService projectPeopleService;

    @Autowired
    public ProjectPeopleController(ProjectPeopleService projectPeopleService) {
        this.projectPeopleService = projectPeopleService;
    }

    @GetMapping
    public List<ProjectPeople> getAllProjectPeople() {
        return projectPeopleService.getAllProjectPeople();
    }

    @GetMapping("/{projectPeopleId}")
    public ProjectPeople getProjectPeopleById(@PathVariable Long projectPeopleId) {
        return projectPeopleService.getProjectPeopleById(projectPeopleId);
    }

    @GetMapping("/{projectId}/participants")
    public List<ProjectPeople> getParticipantsByProjectId(@PathVariable Long projectId) {
        return projectPeopleService.getParticipantsByProjectId(projectId);
    }
}

