package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.entity.Teacher;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.repository.SubjectRepository;
import com.example.demo.repository.TeacherRepository;
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
    public List<Long> getAllTeachers() {
        return teacherRepository.findAll()
                .stream()
                .map(Teacher::getId)
                .toList(); // Java 16+
    }
}
