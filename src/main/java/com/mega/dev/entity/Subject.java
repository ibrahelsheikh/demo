package com.mega.dev.entity;


import com.mega.dev.emuns.Grade;
import com.mega.dev.emuns.Semester;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long id;

    @Column(nullable = false)
    @NotNull(message = "name required")
    private String name;

    @Column(nullable = false,name="SEMESTER")
    @CollectionTable(
            name = "subject_semesters",
            joinColumns = @JoinColumn(name = "subject_id")
    )
    @Enumerated(EnumType.STRING)
    @NotNull(message = "semester required")
    private List<Semester> semester;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull(message = "grade required")
    private Grade grade;

}
