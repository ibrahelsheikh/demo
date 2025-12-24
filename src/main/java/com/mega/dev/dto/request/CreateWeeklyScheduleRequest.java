package com.mega.dev.dto.request;

import com.mega.dev.dto.general.WeekSchedulerDto;
import com.mega.dev.emuns.Grade;
import com.mega.dev.emuns.Semester;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record CreateWeeklyScheduleRequest(    // done

        @NotNull(message = "Grade is required")
        Grade grade,

        @NotNull(message = "Semester is required")
        Semester semester,

        @Min(value = 1, message = "Class number must be >= 1")
        @Max(value = 10, message = "Class number must be <= 10")
        int classNumber,

        @NotNull(message = "Date is required")
        LocalDate date,

        @NotNull(message = "Week schedule is required")
        WeekSchedulerDto weekScheduleDto

) {
}
