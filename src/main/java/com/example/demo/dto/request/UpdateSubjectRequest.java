package com.example.demo.dto.request;

import com.example.demo.emuns.Grade;
import com.example.demo.emuns.Semester;


public record UpdateSubjectRequest(
        Long id,
        String name,
        Semester semester,
        Grade grade
) {
}
