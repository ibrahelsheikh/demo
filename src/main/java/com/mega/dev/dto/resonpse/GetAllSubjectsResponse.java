package com.mega.dev.dto.resonpse;


import com.mega.dev.dto.general.SubjectDto;

import java.util.List;

public record GetAllSubjectsResponse (
        List<SubjectDto> subjects
){
}
