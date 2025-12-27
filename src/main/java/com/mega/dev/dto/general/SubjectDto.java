package com.mega.dev.dto.general;

import com.mega.dev.emuns.Grade;
import com.mega.dev.emuns.Semester;

import java.util.List;


public record SubjectDto(
        Long id,
        String name,
        List<Semester> semester,
        Grade grade
) {}
