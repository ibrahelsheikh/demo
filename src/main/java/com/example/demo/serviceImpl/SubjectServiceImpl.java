package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.entity.Subject;
import com.example.demo.mapper.SubjectMapper;
import com.example.demo.repository.SubjectRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl {

    private final SubjectRepository subjectRepository;

    public Long createSubject(@Valid CreateSubjectRequest request) {

        Subject subject = SubjectMapper.toEntity(request);

        return subjectRepository.save(subject).getId();
    }
}
