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
    private Long subjectId;

    @ManyToOne
    @Column(nullable = false)
    private Long teacherId;

    // Many lessons belong to one day
    @ManyToOne
    @JoinColumn(name = "day_schedule_id")
    private DaySchedule daySchedule;

}
