package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class WeeklySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String grade;
    private String semester;
    private int classNumber;
    private LocalDate date;

    @OneToMany(mappedBy = "weeklySchedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DaySchedule> daysSchedule;

}
