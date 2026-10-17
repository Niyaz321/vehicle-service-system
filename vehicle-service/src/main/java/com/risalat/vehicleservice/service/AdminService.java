package com.risalat.vehicleservice.service;

import com.risalat.vehicleservice.entity.Mechanic;
import com.risalat.vehicleservice.entity.Service; // Dhyan rakhna ye tumhari entity wali Service ho, Spring wali nahi!
import com.risalat.vehicleservice.repository.MechanicRepository;
import com.risalat.vehicleservice.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@org.springframework.stereotype.Service // Is line se Spring ko pata chalta hai ye Service hai
public class AdminService {

    @Autowired
    private MechanicRepository mechanicRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    // Mechanic Add Karna
    public Mechanic addMechanic(Mechanic mechanic) {
        return mechanicRepository.save(mechanic);
    }

    // Saare Mechanics Dekhna
    public List<Mechanic> getAllMechanics() {
        return mechanicRepository.findAll();
    }

    // Service Menu Add Karna
    public Service addService(Service service) {
        return serviceRepository.save(service);
    }

    // Saari Services Dekhna
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }
}