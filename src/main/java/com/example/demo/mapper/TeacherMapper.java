package com.example.demo.mapper;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.entity.Subject;
import com.example.demo.entity.Teacher;

import java.util.List;

public final class TeacherMapper {

    private TeacherMapper() {
        // prevent instantiation
    }

    public static Teacher toEntity(CreateTeacherRequest request, List<Subject> subjects) {
        Teacher teacher = new Teacher();
        teacher.setName(request.getName());
        teacher.setGrades(request.getGrades());
        teacher.setSubjects(subjects);
        return teacher;
    }
}
