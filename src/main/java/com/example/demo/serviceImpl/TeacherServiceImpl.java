package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.dto.request.UpdateTeacherRequest;
import com.example.demo.dto.resonpse.GetAllTeachersResponse;
import com.example.demo.dto.resonpse.SubjectDto;
import com.example.demo.entity.Teacher;
import com.example.demo.mapper.SubjectMapper;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.repository.SubjectRepository;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.SubjectService;
import com.example.demo.service.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final SubjectRepository subjectRepository;
    private final TeacherMapper teacherMapper;
    private final SubjectMapper subjectMapper;

    @Override
    public Long createTeacher(@Valid CreateTeacherRequest request) {

        var subjects = subjectRepository.findAllById(request.getSubjectIds());

        if (subjects.size() != request.getSubjectIds().size()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Invalid subject IDs: " + request.getSubjectIds()
            );
        }

        Teacher teacher = teacherMapper.toEntity(request, subjects);

        return teacherRepository.save(teacher).getId();
    }

    @Override
    public GetAllTeachersResponse getAllTeachers() {
        List<Teacher> teachers = teacherRepository.findAll();
        return teacherMapper.toDtoList(teachers);
    }


    @Override
    public void deleteTeacher(Long teacherId) {
        if (!teacherRepository.existsById(teacherId)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Teacher not found with ID: " + teacherId
            );
        }
        teacherRepository.deleteById(teacherId);

    }


    @Override
    public Teacher updateTeacher(UpdateTeacherRequest request) {

        Long teacherId = request.id();

        Teacher teacher = teacherRepository.findById(teacherId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Teacher not found with ID: " + teacherId
                ));

        teacherMapper.updateTeacherFromRequest(request, teacher);

        return teacherRepository.save(teacher);
    }

}