package com.example.demo.dto.general;

import java.util.List;

public record WeekSchedulerDto(
        List<DaySchedulerDto> days
){
}
