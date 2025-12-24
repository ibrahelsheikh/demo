package com.mega.dev.dto.general;

import com.mega.dev.emuns.Grade;

public record RoomDto(
        Long id,
        int classNumber,
        Grade grade

) {
}
