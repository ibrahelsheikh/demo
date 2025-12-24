package com.mega.dev.mapper;

import com.mega.dev.dto.general.SubjectDto;
import com.mega.dev.dto.request.CreateSubjectRequest;
import com.mega.dev.dto.resonpse.GetAllSubjectsResponse;
import com.mega.dev.entity.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
@RequiredArgsConstructor
public  class SubjectMapper {

    public Subject toEntity(CreateSubjectRequest request) {
        Subject subject = new Subject();
        subject.setName(request.getName());
        subject.setSemester(request.getSemester());
        subject.setGrade(request.getGrade());
        return subject;
    }

    public SubjectDto toDto(Subject subject) {
        return new SubjectDto(
                subject.getId(),
                subject.getName(),
                subject.getSemester(),
                subject.getGrade()
        );

    }


    public GetAllSubjectsResponse toDtoList(List<Subject> subjects) {
        List<SubjectDto> subjectDtos = subjects.stream()
                .map(this::toDto)  // converts Subject -> SubjectDto
                .collect(Collectors.toList());

        return new GetAllSubjectsResponse(subjectDtos);
    }


}

