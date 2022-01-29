package com.webdevelopment.airline_reservation_system.service;

import com.webdevelopment.airline_reservation_system.models.Users;
import com.webdevelopment.airline_reservation_system.repositories.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public void save(Users users) {
        usersRepository.save(users);
    }

}
