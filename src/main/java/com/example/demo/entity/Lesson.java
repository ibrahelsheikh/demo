package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    @ManyToOne
    @Column(nullable = false)
    private Subject subject;

    @ManyToOne
    @Column(nullable = false)
    private Teacher teacher;


    @ManyToOne
    @JoinColumn(nullable = false)
    private DaySchedule daySchedule;

}
