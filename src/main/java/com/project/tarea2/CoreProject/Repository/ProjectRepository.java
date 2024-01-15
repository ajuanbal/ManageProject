package com.project.tarea2.CoreProject.Repository;

import com.project.tarea2.CoreProject.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findAllByOrderByBudgetDesc();
}
