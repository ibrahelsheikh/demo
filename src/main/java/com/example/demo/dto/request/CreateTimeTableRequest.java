package com.example.demo.dto.request;

import com.example.demo.dto.general.DaySchedulerDto;
import com.example.demo.emuns.Grade;
import com.example.demo.emuns.Semester;

import java.util.Date;
import java.util.List;

public record CreateTimeTableRequest (

        Grade grade,
        Semester semester,
        Date date,

        List<DaySchedulerDto> DaysScheduler

){
}
