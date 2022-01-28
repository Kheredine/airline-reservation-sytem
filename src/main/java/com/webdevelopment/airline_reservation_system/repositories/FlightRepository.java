package com.webdevelopment.airline_reservation_system.repositories;

import com.webdevelopment.airline_reservation_system.models.Flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
