package com.risalat.vehicleservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data // Ye automatic Getter/Setter bana dega
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String role; // 'ADMIN' or 'CUSTOMER'
    private String phone;
}