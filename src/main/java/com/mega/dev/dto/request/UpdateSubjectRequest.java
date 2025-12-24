package com.mega.dev.dto.request;

import com.mega.dev.emuns.Grade;
import com.mega.dev.emuns.Semester;


public record UpdateSubjectRequest(
        Long id,
        String name,
        Semester semester,
        Grade grade
) {
}
