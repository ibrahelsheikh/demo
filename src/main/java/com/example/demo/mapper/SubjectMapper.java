package com.example.demo.mapper;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.entity.Subject;

public final class SubjectMapper {

    private SubjectMapper() {
        // prevent instantiation
    }

    public static Subject toEntity(CreateSubjectRequest request) {
        Subject subject = new Subject();
        subject.setName(request.getName());
        subject.setSemester(request.getSemester());
        subject.setGrade(request.getGrade());
        return subject;
    }
}
