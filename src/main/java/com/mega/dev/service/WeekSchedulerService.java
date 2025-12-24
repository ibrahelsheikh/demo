package com.mega.dev.service;

import com.mega.dev.dto.request.CreateWeeklyScheduleRequest;
import com.mega.dev.dto.resonpse.WeeklyScheduleResponse;
import com.mega.dev.entity.WeeklySchedule;

import java.awt.print.Pageable;
import java.util.List;

public interface WeekSchedulerService {


    WeeklySchedule create(CreateWeeklyScheduleRequest request);

    List<WeeklyScheduleResponse> getAllWeeklySchedules(Pageable pageable);

    WeeklySchedule updateWeeklySchedule(Long scheduleId, CreateWeeklyScheduleRequest request);

}
