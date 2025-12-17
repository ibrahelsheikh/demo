package com.example.demo.entity;


import com.example.demo.emuns.Grade;
import com.example.demo.emuns.Semester;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull(message = "name required")
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull(message = "semester required")
    private Semester semester;

    @Column(nullable = false)
    private Grade grade;

}
