package com.mega.dev.service;


import com.mega.dev.dto.request.CreateTeacherRequest;
import com.mega.dev.dto.resonpse.GetAllTeachersResponse;
import com.mega.dev.entity.Teacher;


public interface TeacherService {
    Long createTeacher(CreateTeacherRequest createTeacherRequest);
    GetAllTeachersResponse getAllTeachers();
    void deleteTeacher(Long teacherId);

    Teacher updateTeacher(Long teacherId, CreateTeacherRequest createTeacherRequest);

}
