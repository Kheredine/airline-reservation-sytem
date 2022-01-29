package com.webdevelopment.airline_reservation_system.service;

import java.util.List;
import java.util.Optional;

import com.webdevelopment.airline_reservation_system.models.Flights;
import com.webdevelopment.airline_reservation_system.repositories.FlightsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightsService {

    @Autowired
    private FlightsRepository flightsRepository;

    // Get All Flightss
    public List<Flights> findAll() {
        return flightsRepository.findAll();
    }

    // Get Flights By Id
    public Optional<Flights> findById(int id) {
        return flightsRepository.findById(id);
    }

    // Delete Flights
    public void delete(int id) {
        flightsRepository.deleteById(id);
    }

}
