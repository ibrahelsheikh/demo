package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TeacherServiceImpl implements TeacherService {


    @Override
    public UUID createTeacher(@Valid CreateTeacherRequest createTeacherRequest) {
        return null;
    }

    @Override
    public List<UUID> getAllTeachers() {
        return List.of();
    }
}
