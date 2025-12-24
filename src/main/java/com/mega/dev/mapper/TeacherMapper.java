package com.mega.dev.mapper;

import com.mega.dev.dto.general.TeacherDto;
import com.mega.dev.dto.request.CreateTeacherRequest;
import com.mega.dev.dto.resonpse.GetAllTeachersResponse;
import com.mega.dev.entity.Subject;
import com.mega.dev.entity.Teacher;
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


//    public void updateTeacherFromRequest(UpdateTeacherRequest request, Teacher teacher) {
//        teacher.setName(request.name());
//        teacher.setSubjects(request.subjectIds());
//        teacher.setGrades(request.grades());
//    }




}
