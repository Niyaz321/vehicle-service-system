package com.risalat.vehicleservice.repository;

import com.risalat.vehicleservice.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId); // Customer apni history dekh sake
}