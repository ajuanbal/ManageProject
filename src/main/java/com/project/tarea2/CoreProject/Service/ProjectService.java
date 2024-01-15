package com.project.tarea2.CoreProject.Service;

import com.project.tarea2.CoreProject.Entity.Persona;
import com.project.tarea2.CoreProject.Entity.Project;
import com.project.tarea2.CoreProject.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectPeopleService projectPeopleService;


    @Autowired
    public ProjectService(ProjectRepository projectRepository, ProjectPeopleService projectPeopleService) {
        this.projectRepository = projectRepository;
        this.projectPeopleService = projectPeopleService;
    }
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long projectId) {
        return projectRepository.findById(projectId).orElse(null);
    }

    public List<ProjectInfo> getAllProjectsOrderedByBudgetDesc() {
        List<Project> projects = projectRepository.findAllByOrderByBudgetDesc();
        return mapProjectsToProjectInfo(projects);
    }

    private List<ProjectInfo> mapProjectsToProjectInfo(List<Project> projects) {
        List<ProjectInfo> projectInfoList = new ArrayList<>();

        for (Project project : projects) {
            Persona director = projectPeopleService.getDirectorByProjectId(project.getId());

            ProjectInfo projectInfo = new ProjectInfo();
            projectInfo.setProjectName(project.getName());
            projectInfo.setProjectBudget(project.getBudget());
            projectInfo.setDirectorFirstName(director.getFirstName());
            projectInfo.setDirectorLastName(director.getLastName());

            projectInfoList.add(projectInfo);
        }

        return projectInfoList;
    }


}

