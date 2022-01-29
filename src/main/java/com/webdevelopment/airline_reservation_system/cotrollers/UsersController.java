package com.webdevelopment.airline_reservation_system.cotrollers;

import com.webdevelopment.airline_reservation_system.models.Users;
import com.webdevelopment.airline_reservation_system.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {
    // user/addNew
    @Autowired
    private UsersService usersService;

    @PostMapping(value = "user/addNew")
    public String addNew(Users users) {
        usersService.save(users);
        return "signIn";
    }

}
