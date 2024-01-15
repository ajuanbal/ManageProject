package com.project.tarea2.CoreProject.Repository;

import com.project.tarea2.CoreProject.Entity.ProjectPeople;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface ProjectPeopleRepository extends JpaRepository<ProjectPeople, Long> {
    List<ProjectPeople> findByProjectId(Long projectId);

    @Query("SELECT pp FROM ProjectPeople pp WHERE pp.project.id = :projectId AND pp.role = 'Director'")
    ProjectPeople findDirectorByProjectId(Long projectId);




}

