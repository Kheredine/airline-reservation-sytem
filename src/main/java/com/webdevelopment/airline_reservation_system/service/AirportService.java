package com.webdevelopment.airline_reservation_system.service;

import com.webdevelopment.airline_reservation_system.models.Airport;
import com.webdevelopment.airline_reservation_system.repositories.AirportRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    // Get All Airports
    public List<Airport> findAll() {
        return airportRepository.findAll();
    }

    // Get Airport By Id
    public Optional<Airport> findById(int id) {
        return airportRepository.findById(id);
    }

}
