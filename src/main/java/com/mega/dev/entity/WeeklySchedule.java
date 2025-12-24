package com.mega.dev.entity;


import com.mega.dev.emuns.Grade;
import com.mega.dev.emuns.Semester;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "weekly_schedule", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"grade", "semester", "class_number", "date"})
})
@Data
public class WeeklySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Grade grade;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Semester semester;

    @Column(name = "class_number", nullable = false)
    private int classNumber;

    @Column(nullable = false)
    private LocalDate date;

    @OneToMany(mappedBy = "weeklySchedule", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.LAZY)
    private List<DaySchedule> daysSchedule;
}