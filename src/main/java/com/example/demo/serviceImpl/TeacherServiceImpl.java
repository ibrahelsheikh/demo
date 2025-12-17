package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {


    @Override
    public  createTeacher(@Valid CreateTeacherRequest createTeacherRequest) {



        return null;
    }

    @Override
    public List<Long> getAllTeachers() {
        return List.of();
    }
}
