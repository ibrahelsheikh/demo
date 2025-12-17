package com.example.demo.service;


import com.example.demo.dto.request.CreateTeacherRequest;

import java.util.List;
import java.util.UUID;


public interface TeacherService {
    UUID createTeacher(CreateTeacherRequest createTeacherRequest);
    List<UUID> getAllTeachers();

}

