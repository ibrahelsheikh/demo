package com.example.demo.dto.request;


import com.example.demo.emuns.Semester;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateSubjectRequest {

    @NotNull(message = "name required")
    private String name;

    @NotNull(message = "semester required")
    private Semester semester;

}
