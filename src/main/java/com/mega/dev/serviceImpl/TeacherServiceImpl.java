package com.mega.dev.serviceImpl;

import com.mega.dev.dto.request.CreateTeacherRequest;
import com.mega.dev.dto.resonpse.GetAllTeachersResponse;
import com.mega.dev.entity.Teacher;
import com.mega.dev.mapper.SubjectMapper;
import com.mega.dev.mapper.TeacherMapper;
import com.mega.dev.repository.SubjectRepository;
import com.mega.dev.repository.TeacherRepository;
import com.mega.dev.service.TeacherService;
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
    public Teacher updateTeacher(Long teacherId, CreateTeacherRequest createTeacherRequest) {
        // edit teacher in database and return updated teacher
        if (!teacherRepository.existsById(teacherId)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Teacher not found with ID: " + teacherId
            );
        }

        teacherRepository.save(
                teacherMapper.toEntity(createTeacherRequest, subjectRepository.findAllById(createTeacherRequest.getSubjectIds()))
        );




        return null;
    }


//    @Override
//    public Teacher updateTeacher(UpdateTeacherRequest request) {
//
//        Long teacherId = request.id();
//
//        Teacher teacher = teacherRepository.findById(teacherId)
//                .orElseThrow(() -> new ResponseStatusException(
//                        HttpStatus.NOT_FOUND,
//                        "Teacher not found with ID: " + teacherId
//                ));
//
//        teacherMapper.updateTeacherFromRequest(request, teacher);
//
//        return teacherRepository.save(teacher);
//    }

}