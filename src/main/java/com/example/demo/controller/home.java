package com.example.demo.controller;

import com.example.demo.dto.request.CreateSubjectRequest;
import com.example.demo.dto.request.CreateTeacherRequest;
import com.example.demo.dto.request.UpdateTeacherRequest;
import com.example.demo.service.SubjectService;
import com.example.demo.service.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class home {

    private final TeacherService teacherService;
    private final SubjectService subjectService;

    @PostMapping("/teachers")
    public ResponseEntity<URI> CreateTeacher(
            @Valid @RequestBody CreateTeacherRequest createTeacherRequest

    ) {
        Long savedTeacherId = teacherService.createTeacher(createTeacherRequest);
        return ResponseEntity
                .created(URI.create("/teachers/" + savedTeacherId))
                .build();
    }


    @GetMapping("/teachers")
    public ResponseEntity<?> getAllTeachers() {
        return new ResponseEntity<>(teacherService.getAllTeachers(), HttpStatus.OK);
    }


    @DeleteMapping("/teachers/{teacherId}")
    public ResponseEntity<?> deleteTeacher(@PathVariable Long teacherId) {
        teacherService.deleteTeacher(teacherId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PutMapping("/teachers/{teacherId} ")
    public ResponseEntity<?> updateTeacher(
            @Valid @RequestBody UpdateTeacherRequest updateTeacherRequest
    ) {
        teacherService.updateTeacher(updateTeacherRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PostMapping("/subjects")
    public ResponseEntity<URI> createSubject(
            @Valid @RequestBody CreateSubjectRequest createSubjectRequest
    ) {
        Long savedSubjectId = subjectService.createSubject(createSubjectRequest);
        return ResponseEntity
                .created(URI.create("/subjects/" + savedSubjectId))
                .build();
    }


    @GetMapping("/subjects")
    public ResponseEntity<?> getAllSubjects() {
        return new ResponseEntity<>(subjectService.getAllSubjects(), HttpStatus.OK);
    }


    @DeleteMapping("/subjects/{subjectId}")
    public ResponseEntity<?> deleteSubject(@PathVariable Long subjectId) {
        subjectService.deleteSubject(subjectId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


//    @PutMapping("/subjects/{subjectId} ")
//    public ResponseEntity<?> updateSubject(
//            @Valid @RequestBody CreateSubjectRequest createSubjectRequest
//    ) {
//        subjectService.updateSubject(createSubjectRequest);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//
//    @PostMapping("/teachers/{teacherId}/subjects/{subjectId} ")
//    public ResponseEntity<?> assignSubjectToTeacher(
//            @PathVariable Long teacherId,
//            @PathVariable Long subjectId
//    ) {
//        teacherService.assignSubjectToTeacher(teacherId, subjectId);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//
//    @PostMapping("/teachers/{teacherId}/remove-subject/{subjectId} ")
//    public ResponseEntity<?> removeSubjectFromTeacher(
//            @PathVariable Long teacherId,
//            @PathVariable Long subjectId
//    ) {
//        teacherService.removeSubjectFromTeacher(teacherId, subjectId);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//
//    @PostMapping("/teachers/{teacherId}/subjects")
//    public ResponseEntity<?> assignMultipleSubjectsToTeacher(
//            @PathVariable Long teacherId,
//            @RequestBody Long[] subjectIds
//    ) {
//        teacherService.assignMultipleSubjectsToTeacher(teacherId, subjectIds);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//
//    // create endpoint to unassign multiple subjects from a teacher
//    @PostMapping("/teachers/{teacherId}/remove-subjects")
//    public ResponseEntity<?> removeMultipleSubjectsFromTeacher(
//            @PathVariable Long teacherId,
//            @RequestBody Long[] subjectIds
//    ) {
//        teacherService.removeMultipleSubjectsFromTeacher(teacherId, subjectIds);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }


    @PostMapping("/weekly-schedules")
    public ResponseEntity<Void> createWeeklySchedule(
            @RequestBody CreateWeeklyScheduleRequest request
    ) {
        Long id = weekSchedulerService.create(request);

        return ResponseEntity
                .created(URI.create("/weekly-schedules/" + id))
                .build();
    }







}














