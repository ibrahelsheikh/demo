package com.mega.dev.entity;

import com.mega.dev.emuns.Grade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rooms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int classNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Grade grade;
}
