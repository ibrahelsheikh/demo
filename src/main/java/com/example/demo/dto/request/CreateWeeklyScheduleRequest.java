package com.example.demo.dto.request;

import com.example.demo.dto.general.WeekSchedulerDto;
import com.example.demo.emuns.Grade;
import com.example.demo.emuns.Semester;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record CreateWeeklyScheduleRequest(

        @NotNull(message = "Grade is required")
        Grade grade,

        @NotNull(message = "Semester is required")
        Semester semester,

        @Min(value = 1, message = "Class number must be >= 1")
        @Max(value = 20, message = "Class number must be <= 20")
        int classNumber,

        @NotNull(message = "Date is required")
        LocalDate date,

        @NotNull(message = "Week schedule is required")
        WeekSchedulerDto weekScheduleDto

) {
}
