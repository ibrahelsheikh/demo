package com.mega.dev.entity;


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
    @JoinColumn(name = "id") // the actual column in the lesson table
    private Subject subject;

    @ManyToOne
    @Column(nullable = false)
    private Teacher teacher;


    @ManyToOne
    private DaySchedule daySchedule;

}
