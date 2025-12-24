package com.mega.dev.dto.request;

import com.mega.dev.emuns.Grade;

import java.util.List;

public record UpdateTeacherRequest (
        Long id,
        String name,
        List<Long> subjectIds,
        List<Grade> grades
){
}
