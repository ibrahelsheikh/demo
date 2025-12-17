package com.example.demo.controller;

import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.serviceImpl.TeacherServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class home {

    private final TeacherServiceImpl teacherService;

    @PostMapping("/addNewTeacher")
    public ResponseEntity<URI> CreateTeacher(
            @Valid @RequestBody CreateTeacherRequest createTeacherRequest

    ) {
        UUID savedTeacherId = teacherService.createTeacher(createTeacherRequest);
        return ResponseEntity.created(URI.create("/teachers/" + savedTeacherId.getClass())).build();
    }


//    @PostMapping("/addNewSubject")
//    public ResponseEntity<Teacher> createSubject(
//            @Valid @RequestBody CreateSubjectRequest createSubjectRequest
//    ) {
//        Teacher updatedTeacher = teacherService.createSubject(createSubjectRequest);
//        return new ResponseEntity<>(updatedTeacher, HttpStatus.OK);
//    }


}
