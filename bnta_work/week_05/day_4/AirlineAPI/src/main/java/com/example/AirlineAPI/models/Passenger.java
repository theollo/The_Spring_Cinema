package com.example.AirlineAPI.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "passengerName")
    private String name;

    @Column
    private String email;

    public Passenger(String name, String email) {
        this.name = name;
        this.email = email;
    }

    private List<Flight> flights;


    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
    public void addFlight(Flight flight){
        this.flights.add(flight);
    }
    public void removeFlight(Flight flight){
        this.flights.remove(flight);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

