package com.example.demo.dto.request;


import com.example.demo.emuns.Grade;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@Builder
public class CreateTeacherRequest {

    @NotNull(message = "teacher name required")
    private String name;

    @NotEmpty(message = "at least one subject required")
    private List<Long> subjectIds;

    @NotNull(message = "grade required")
    private Grade grade;

}
