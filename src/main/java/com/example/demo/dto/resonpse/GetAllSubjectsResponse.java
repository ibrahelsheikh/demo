package com.example.demo.dto.resonpse;


import java.util.List;

public record GetAllSubjectsResponse (
        List<SubjectDto> subjects
){

}
