package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.dto.resonpse.GetAllSubjectsResponse;
import com.example.demo.entity.Subject;
import com.example.demo.mapper.SubjectMapper;
import com.example.demo.repository.SubjectRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl {

    private final SubjectRepository subjectRepository;
    private final SubjectMapper subjectMapper;

    public Long createSubject(@Valid CreateSubjectRequest request) {

        Subject subject = subjectMapper.toEntity(request);

        return subjectRepository.save(subject).getId();
    }


    public GetAllSubjectsResponse getAllSubjects() {
        List<Subject> subjects = subjectRepository.findAll();
        return subjectMapper.toDtoList(subjects);
    }
}
