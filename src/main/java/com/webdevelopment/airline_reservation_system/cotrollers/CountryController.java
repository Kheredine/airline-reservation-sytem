package com.webdevelopment.airline_reservation_system.cotrollers;

import com.webdevelopment.airline_reservation_system.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    // Get All Countrys
    @GetMapping("/home")
    public String findAll(Model model) {
        model.addAttribute("countries", countryService.findAll());
        return "index";
    }

}
