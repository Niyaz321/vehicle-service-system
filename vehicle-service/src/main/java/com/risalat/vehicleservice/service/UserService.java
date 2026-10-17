package com.risalat.vehicleservice.service;

import com.risalat.vehicleservice.entity.User;
import com.risalat.vehicleservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // User Register Karna
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // User Login Check Karna
    public User loginUser(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user.get(); // Login Successful
        }
        return null; // Login Failed
    }
}