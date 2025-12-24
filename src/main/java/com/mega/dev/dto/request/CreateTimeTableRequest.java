package com.mega.dev.dto.request;

import com.mega.dev.dto.general.DaySchedulerDto;
import com.mega.dev.emuns.Grade;
import com.mega.dev.emuns.Semester;

import java.util.Date;
import java.util.List;

public record CreateTimeTableRequest (

        Grade grade,
        Semester semester,
        Date date,

        List<DaySchedulerDto> DaysScheduler

){
}
