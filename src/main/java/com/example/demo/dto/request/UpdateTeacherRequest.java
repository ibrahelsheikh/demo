package com.example.demo.dto.request;

import com.example.demo.emuns.Grade;

import java.util.List;

public record UpdateTeacherRequest (
        Long id,
        String name,
        List<Long> subjectIds,
        List<Grade> grades

){
}
