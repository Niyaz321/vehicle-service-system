package com.risalat.vehicleservice.service;

import com.risalat.vehicleservice.entity.Booking;
import com.risalat.vehicleservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    // Nayi Booking Create Karna
    public Booking createBooking(Booking booking) {
        booking.setStatus("PENDING"); // Default status
        return bookingRepository.save(booking);
    }

    // User ki purani bookings dekhna
    public List<Booking> getBookingsByUser(Long userId) {
        return bookingRepository.findByUserId(userId);
    }

    // Admin ke liye saari bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }



    // new code add


    @Autowired
    private com.risalat.vehicleservice.repository.MechanicRepository mechanicRepository;

    // Admin Booking Update karega (Status aur Mechanic Assign)
    public Booking updateBooking(Long bookingId, Long mechanicId, String status) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);
        if (booking != null) {
            booking.setStatus(status);
            if (mechanicId != null) {
                com.risalat.vehicleservice.entity.Mechanic mechanic = mechanicRepository.findById(mechanicId).orElse(null);
                booking.setMechanic(mechanic);
            }
            return bookingRepository.save(booking);
        }
        return null;
    }

}