package com.webdevelopment.airline_reservation_system.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "flights")
public class Flights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private Integer id;

    @Column(name = "airline", nullable = false)
    private String airline;

    @Column(name = "aircraft_code", nullable = false)
    private String aircraftCode;

    @Column(name = "depature_time", nullable = false)
    private String depatureTime;

    @Column(name = "duration", nullable = false)
    private String duration;

    @Column(name = "arrival_time", nullable = false)
    private String arrivalTime;

    @Column(name = "price", nullable = false)
    private String price;

    @Column(name = "stop", insertable = false, updatable = false)
    private String stop;

    @ManyToOne
    @JoinColumn(name = "departure_country", insertable = false, updatable = false)
    private Country departureCountry;

    @ManyToOne
    @JoinColumn(name = "arrival_country", insertable = false, updatable = false)
    private Country arrivalCountry;

    @ManyToOne
    @JoinColumn(name = "departure_airport", insertable = false, updatable = false)
    private Airport departureAirport;

    @ManyToOne
    @JoinColumn(name = "arrival_airport", insertable = false, updatable = false)
    private Airport arrivalAirport;

}
