package com.example.demo.dto.request;

import com.example.demo.dto.general.DaySchedulerDto;

import java.util.List;

public record CreateTimeTableRequest (




        List<DaySchedulerDto> DaysScheduler

){
}
