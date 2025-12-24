package com.mega.dev.serviceImpl;

import com.mega.dev.dto.request.CreateWeeklyScheduleRequest;
import com.mega.dev.dto.resonpse.WeeklyScheduleResponse;
import com.mega.dev.entity.WeeklySchedule;
import com.mega.dev.repository.SubjectRepository;
import com.mega.dev.repository.TeacherRepository;
import com.mega.dev.service.WeekSchedulerService;
import lombok.RequiredArgsConstructor;
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


//        Subject subject = subjectRepository.findById(request.)
//                .orElseThrow(() -> new ChangeSetPersister.NotFoundException("Subject not found"));
//
//        Teacher teacher = teacherRepository.findById(request.teacherId())
//                .orElseThrow(() -> new ChangeSetPersister.NotFoundException("Teacher not found"));
//
//        lesson.setSubject(subject);
//        lesson.setTeacher(teacher);


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
