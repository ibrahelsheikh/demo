package com.mega.dev.dto.resonpse;

import com.mega.dev.dto.general.TeacherDto;

import java.util.List;

public record GetAllTeachersResponse(
        List<TeacherDto> teachers
) {
}
