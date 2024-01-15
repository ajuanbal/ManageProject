package com.project.tarea2.CoreProject.Controller;

import com.project.tarea2.CoreProject.Entity.Project;
import com.project.tarea2.CoreProject.Service.ProjectInfo;
import com.project.tarea2.CoreProject.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{projectId}")
    public Project getProjectById(@PathVariable Long projectId) {
        return projectService.getProjectById(projectId);
    }

    @GetMapping("/list")
    public List<ProjectInfo> getAllProjectsOrderedByBudgetDesc() {
        return projectService.getAllProjectsOrderedByBudgetDesc();
    }
}

