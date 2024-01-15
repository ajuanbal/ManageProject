package com.project.tarea2.CoreProject.Entity;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "Persona")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private Boolean external;
}

