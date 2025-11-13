package com.back.domain.reservation.repository;

import com.back.domain.reservation.entity.Reservation;

import java.time.LocalDate;
import java.util.Optional;

public interface ReservationRepositoryCustom {
    boolean existsOverlappingReservation(
            Long postId,
            LocalDate startAt,
            LocalDate endAt,
            Long excludeReservationId
    );
    boolean existsActiveReservation(Long postId, Long authorId);

    Optional<Reservation> findByIdWithOptions(Long id);
}
