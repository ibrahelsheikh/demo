package com.mega.dev.entity;

import com.mega.dev.emuns.Grade;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "name required")
    @Column(nullable = false)
    private String name;


    @ManyToMany
    @JoinTable(
            name = "teacher_subjects",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )

    @NotNull(message = "at least one subject required")
    private List<Subject> subjects;

    @ElementCollection(targetClass = Grade.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "teacher_grades",
            joinColumns = @JoinColumn(name = "teacher_id")
    )
    @Column(name = "grade", nullable = false)
    @NotNull(message = "at least one grade required")
    private List<Grade> grades;

}
