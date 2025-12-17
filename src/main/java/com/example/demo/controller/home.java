package com.example.demo.controller;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import com.example.demo.serviceImpl.TeacherServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class home {

    private final TeacherServiceImpl teacherService;

    @PostMapping("/addNewTeacher")
    public ResponseEntity<URI> CreateTeacher(
            @Valid @RequestBody CreateTeacherRequest createTeacherRequest

    ) {
        Long savedTeacher = teacherService.createTeacher(createTeacherRequest);
        return ResponseEntity.created(URI.create("/teachers/" + savedTeacher.getId())).build();
    }


//    @PostMapping("/addNewSubject")
//    public ResponseEntity<Teacher> createSubject(
//            @Valid @RequestBody CreateSubjectRequest createSubjectRequest
//    ) {
//        Teacher updatedTeacher = teacherService.createSubject(createSubjectRequest);
//        return new ResponseEntity<>(updatedTeacher, HttpStatus.OK);
//    }


}
