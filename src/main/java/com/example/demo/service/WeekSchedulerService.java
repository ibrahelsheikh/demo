package com.example.demo.service;

import com.example.demo.dto.request.CreateWeeklyScheduleRequest;
import com.example.demo.dto.resonpse.WeeklyScheduleResponse;
import com.example.demo.entity.WeeklySchedule;

import java.awt.print.Pageable;
import java.util.List;

public interface WeekSchedulerService {


    WeeklySchedule create(CreateWeeklyScheduleRequest request);

    List<WeeklyScheduleResponse> getAllWeeklySchedules(Pageable pageable);

    WeeklySchedule updateWeeklySchedule(Long scheduleId, CreateWeeklyScheduleRequest request);

}
