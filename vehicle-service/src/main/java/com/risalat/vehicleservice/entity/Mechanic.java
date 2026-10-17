package com.risalat.vehicleservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "mechanics")
@Data
public class Mechanic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialty;
    private boolean available = true;
}