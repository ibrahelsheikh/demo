package com.example.demo.controller;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.service.SubjectService;
import com.example.demo.serviceImpl.SubjectServiceImpl;
import com.example.demo.serviceImpl.TeacherServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Validated
public class home {

    private final TeacherServiceImpl teacherService;
    private final SubjectServiceImpl subjectService;

    @PostMapping("/addNewTeacher")
    public ResponseEntity<URI> CreateTeacher(
            @Valid @RequestBody CreateTeacherRequest createTeacherRequest

    ) {
        Long savedTeacherId = teacherService.createTeacher(createTeacherRequest);
        return ResponseEntity
                .created(URI.create("/teachers/" + savedTeacherId))
                .build();
    }


    @PostMapping("/addNewSubject")
    public ResponseEntity<URI> createSubject(
            @Valid @RequestBody CreateSubjectRequest createSubjectRequest
    ) {
        Long savedSubjectId = subjectService.createSubject(createSubjectRequest);
        return ResponseEntity
                .created(URI.create("/subjects/" + savedSubjectId))
                .build();
    }

    @GetMapping("/getAllSubjects")
    public ResponseEntity<?> getAllSubjects() {
        return new ResponseEntity<>(subjectService.getAllSubjects(), HttpStatus.OK);
    }


    @GetMapping("/getALLTeachers")
    public ResponseEntity<?> getAllTeachers() {
        return new ResponseEntity<>(teacherService.getAllTeachers(), HttpStatus.OK);
    }


}
