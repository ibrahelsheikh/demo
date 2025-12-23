package com.example.demo.dto.general;

import java.util.List;

public record weekSchedulerDto (
        List<DaySchedulerDto> days
){
}
