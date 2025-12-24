package com.mega.dev.dto.request;


import com.mega.dev.emuns.Grade;
import com.mega.dev.emuns.Semester;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CreateSubjectRequest {

    @NotNull(message = "name required")
    private String name;

    @NotNull(message = "semester required")
    private Semester semester;

    @NotNull(message = "grade required")
    private Grade grade;

}
