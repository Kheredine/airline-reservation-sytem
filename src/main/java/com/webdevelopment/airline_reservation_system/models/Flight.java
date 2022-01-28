package com.webdevelopment.airline_reservation_system.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private Integer id;

    @Column(name = "depature_time", nullable = false)
    private String depatureTime;

    @Column(name = "arrival_time", nullable = false)
    private String arrivalTime;

    @OneToOne
    @JoinColumn(name = "aircraft_id", insertable = false, updatable = false)
    private Aircraft aircraft;

    @OneToOne
    @JoinColumn(name = "airport_id", insertable = false, updatable = false)
    private Airport airport;
}
