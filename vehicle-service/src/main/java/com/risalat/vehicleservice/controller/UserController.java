package com.risalat.vehicleservice.controller;

import com.risalat.vehicleservice.entity.User;
import com.risalat.vehicleservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*") // Frontend ko permission dene ke liye
public class UserController {

    @Autowired
    private UserService userService;

    // Register API
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // Login API
    // Login API
    @PostMapping("/login")
    public org.springframework.http.ResponseEntity<?> login(@RequestBody User user) {
        User loggedInUser = userService.loginUser(user.getEmail(), user.getPassword());

        if (loggedInUser != null) {
            // Password sahi hai toh user ka data return karo
            return org.springframework.http.ResponseEntity.ok(loggedInUser);
        } else {
            // Password galat hai toh professional error bhejo
            return org.springframework.http.ResponseEntity
                    .status(org.springframework.http.HttpStatus.UNAUTHORIZED)
                    .body("{\"message\": \"Invalid email or password.\"}");
        }

    }
}