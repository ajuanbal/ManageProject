package com.project.tarea2.CoreProject.Entity;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "Project_people")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectPeople {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_project", foreignKey = @ForeignKey(name = "fk_project_people_project"))
    private Project project;

    @ManyToOne
    @JoinColumn(name = "id_person", foreignKey = @ForeignKey(name = "fk_project_people_person"))
    private Persona person;

    private String role;


}

