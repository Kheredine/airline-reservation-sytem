package com.webdevelopment.airline_reservation_system.cotrollers;

import com.webdevelopment.airline_reservation_system.service.FlightsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlightsController {

    @Autowired
    private FlightsService flightsService;

    @GetMapping("/flights")
    public String getFlights(Model model) {

        model.addAttribute("flights", flightsService.findAll());

        return "flights";
    }

}
