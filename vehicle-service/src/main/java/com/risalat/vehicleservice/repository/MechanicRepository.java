package com.risalat.vehicleservice.repository;

import com.risalat.vehicleservice.entity.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MechanicRepository extends JpaRepository<Mechanic, Long> {
    List<Mechanic> findByAvailable(boolean available); // Jo mechanic free hain unhe dhundhne ke liye
}