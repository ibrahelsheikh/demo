package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.entity.Subject;
import com.example.demo.repository.SubjectRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl {

    private final SubjectRepository subjectRepository; // inject repository

    public Long createSubject(@Valid CreateSubjectRequest createSubjectRequest) {

        // Map DTO to Entity
        Subject subject = new Subject();
        subject.setName(createSubjectRequest.getName());
        subject.setSemester(createSubjectRequest.getSemester());
        subject.setGrade(createSubjectRequest.getGrade());

        // Save entity
        Subject savedSubject = subjectRepository.save(subject);

        // Return generated ID
        return savedSubject.getId();
    }
}
