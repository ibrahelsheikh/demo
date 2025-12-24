package com.example.demo.serviceImpl;

import com.example.demo.dto.request.CreateWeeklyScheduleRequest;
import com.example.demo.dto.resonpse.WeeklyScheduleResponse;
import com.example.demo.entity.WeeklySchedule;
import com.example.demo.service.WeekSchedulerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;


@Service
@RequiredArgsConstructor
public class WeekSchedulerServiceImpl implements WeekSchedulerService {


    @Override
    public WeeklySchedule create(CreateWeeklyScheduleRequest request) {
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
