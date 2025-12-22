package com.example.demo.mapper;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.dto.request.UpdateTeacherRequest;
import com.example.demo.dto.resonpse.GetAllTeachersResponse;
import com.example.demo.dto.resonpse.SubjectDto;
import com.example.demo.dto.resonpse.TeacherDto;
import com.example.demo.entity.Subject;
import com.example.demo.entity.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    public TeacherDto toDto(Teacher teacher) {
        return new TeacherDto(
                teacher.getId(),
                teacher.getName(),
                teacher.getSubjects(),
                teacher.getGrades()
        );
    }


    public GetAllTeachersResponse toDtoList(List<Teacher> teachers) {
        List<TeacherDto> teacherDtos = teachers.stream()
                .map(this::toDto)  // converts Teacher -> TeacherDto
                .collect(Collectors.toList());

        return new GetAllTeachersResponse(teacherDtos);
    }


    public void updateTeacherFromRequest(UpdateTeacherRequest request, Teacher teacher) {
        teacher.setName(request.name());
        teacher.setSubjects(request.subjectIds());
        teacher.setGrades(request.grades());
    }




}
