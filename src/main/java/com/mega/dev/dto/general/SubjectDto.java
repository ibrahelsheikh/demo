package com.mega.dev.dto.general;

import com.mega.dev.emuns.Grade;
import com.mega.dev.emuns.Semester;


public record SubjectDto(
        Long id,
        String name,
        java.util.@jakarta.validation.constraints.NotNull(message = "semester required") List<Semester> semester,
        Grade grade
) {}
