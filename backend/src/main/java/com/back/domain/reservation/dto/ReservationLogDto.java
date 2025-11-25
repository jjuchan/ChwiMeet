package com.back.domain.reservation.dto;

import com.back.domain.reservation.common.ReservationStatus;
import com.back.domain.reservation.entity.ReservationLog;

import java.time.LocalDateTime;

public record ReservationLogDto(
        Long id,
        ReservationStatus status,
        LocalDateTime createdAt,
        String authorName
) {
    public ReservationLogDto(ReservationLog log, String authorName) {
        this(
                log.getId(),
                log.getStatus(),
                log.getCreatedAt(),
                authorName
        );
    }
}
