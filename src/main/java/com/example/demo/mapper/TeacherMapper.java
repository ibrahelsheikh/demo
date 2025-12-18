package com.example.demo.mapper;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.entity.Subject;
import com.example.demo.entity.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TeacherMapper {

    public Teacher toEntity(CreateTeacherRequest request, List<Subject> subjects) {
        Teacher teacher = new Teacher();
        teacher.setName(request.getName());
        teacher.setGrades(request.getGrades());
        teacher.setSubjects(subjects);
        return teacher;
    }



}
