package com.mega.dev.dto.request;


import com.mega.dev.emuns.Grade;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTeacherRequest {

    @NotNull(message = "teacher name required")
    private String name;

    @NotEmpty(message = "at least one subject required")
    private List<Long> subjectIds;

    @NotNull(message = "grade required")
    private List<Grade> grades;

}
