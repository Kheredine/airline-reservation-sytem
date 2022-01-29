package com.webdevelopment.airline_reservation_system.service;

import java.util.List;
import java.util.Optional;

import com.webdevelopment.airline_reservation_system.models.Country;
import com.webdevelopment.airline_reservation_system.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Get All Countrys
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    // Get Country By Id
    public Optional<Country> findById(int id) {
        return countryRepository.findById(id);
    }

}
