package com.webdevelopment.airline_reservation_system.repositories;

import com.webdevelopment.airline_reservation_system.models.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
