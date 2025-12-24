package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateWeeklyScheduleRequest;
import com.example.demo.dto.resonpse.WeeklyScheduleResponse;
import com.example.demo.entity.Subject;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.WeeklySchedule;
import com.example.demo.repository.SubjectRepository;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.WeekSchedulerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;


@Service
@RequiredArgsConstructor
public class WeekSchedulerServiceImpl implements WeekSchedulerService {
    private final SubjectRepository subjectRepository;
    private final TeacherRepository teacherRepository;


    @Override
    public WeeklySchedule create(CreateWeeklyScheduleRequest request) {


        Subject subject = subjectRepository.findById(request.)
                .orElseThrow(() -> new ChangeSetPersister.NotFoundException("Subject not found"));

        Teacher teacher = teacherRepository.findById(request.teacherId())
                .orElseThrow(() -> new ChangeSetPersister.NotFoundException("Teacher not found"));

        lesson.setSubject(subject);
        lesson.setTeacher(teacher);



        return null;
    }


    @Override
    public List<WeeklyScheduleResponse> getAllWeeklySchedules(Pageable pageable) {
        return List.of();
    }


    @Override
    public WeeklySchedule updateWeeklySchedule(Long scheduleId, CreateWeeklyScheduleRequest request) {

        return null;
    }


}
