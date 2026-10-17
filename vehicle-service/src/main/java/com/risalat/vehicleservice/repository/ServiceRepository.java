package com.risalat.vehicleservice.repository;

import com.risalat.vehicleservice.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
    // Isme abhi extra method ki zarurat nahi hai, basic save/delete kafi hai
}