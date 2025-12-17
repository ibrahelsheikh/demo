package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {


    @Override
    public Long createTeacher(@Valid CreateTeacherRequest createTeacherRequest) {
        return null;
    }
}
