package com.example.demo.dto.request;

public record lessonDto (
        Long id,
        Long startTime,
        Long endTime,
        Long subjectId,
        Long teacherId
){
}
