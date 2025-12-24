package com.mega.dev.dto.general;

import com.mega.dev.emuns.Grade;
import com.mega.dev.entity.Subject;

import java.util.List;

public record TeacherDto(
        Long id,
        String name,
        List<Subject> subjects,
        List<Grade> grades

) {
}
