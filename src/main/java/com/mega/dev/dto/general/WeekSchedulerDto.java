package com.mega.dev.dto.general;

import java.util.List;

public record WeekSchedulerDto(
        List<DaySchedulerDto> days
){
}
