package com.example.demo.dto.request;


import com.example.demo.emuns.Semester;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CreateSubjectRequest {
    private String name;

    private Semester semester;

}
