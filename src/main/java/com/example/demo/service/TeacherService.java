package com.example.demo.service;


import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.entity.Teacher;


public interface TeacherService {
    Long createTeacher(CreateTeacherRequest createTeacherRequest);

}

