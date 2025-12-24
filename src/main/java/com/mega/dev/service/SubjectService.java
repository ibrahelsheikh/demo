package com.mega.dev.service;

import com.mega.dev.dto.request.CreateSubjectRequest;
import com.mega.dev.dto.resonpse.GetAllSubjectsResponse;

public interface SubjectService {
    Long createSubject(CreateSubjectRequest createSubjectRequest);
    GetAllSubjectsResponse getAllSubjects();
    void deleteSubject(Long subjectId);
}
