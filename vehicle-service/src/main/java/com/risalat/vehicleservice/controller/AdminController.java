package com.risalat.vehicleservice.controller;

import com.risalat.vehicleservice.entity.Mechanic;
import com.risalat.vehicleservice.entity.Service;
import com.risalat.vehicleservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Mechanic Add Karna
    @PostMapping("/mechanics")
    public Mechanic addMechanic(@RequestBody Mechanic mechanic) {
        return adminService.addMechanic(mechanic);
    }

    // Saare Mechanics Dekhna
    @GetMapping("/mechanics")
    public List<Mechanic> getAllMechanics() {
        return adminService.getAllMechanics();
    }

    // Service Add Karna
    @PostMapping("/services")
    public Service addService(@RequestBody Service service) {
        return adminService.addService(service);
    }

    // Saari Services Dekhna
    @GetMapping("/services")
    public List<Service> getAllServices() {
        return adminService.getAllServices();
    }


        //new code add

    @Autowired
    private com.risalat.vehicleservice.service.BookingService bookingService;

    // Booking Update karne ki API
    @PutMapping("/bookings/{id}")
    public com.risalat.vehicleservice.entity.Booking updateBooking(
            @PathVariable Long id,
            @RequestParam(required = false) Long mechanicId,
            @RequestParam String status) {
        return bookingService.updateBooking(id, mechanicId, status);
    }
}