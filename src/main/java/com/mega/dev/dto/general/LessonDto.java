package com.mega.dev.dto.general;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalTime;

public record LessonDto(

        @Positive(message = "Id must be positive")
        Long id,

        @NotNull(message = "Start time is required")
        LocalTime startTime,

        @NotNull(message = "End time is required")
        LocalTime endTime,

        @NotNull(message = "Subject ID is required")
        @Positive(message = "Subject ID must be positive")
        Long subjectId,

        @NotNull(message = "Teacher ID is required")
        @Positive(message = "Teacher ID must be positive")
        Long teacherId
) {

        public LessonDto {
                if (startTime != null && endTime != null && !endTime.isAfter(startTime)) {
                        throw new IllegalArgumentException("End time must be after start time");
                }
        }
}
