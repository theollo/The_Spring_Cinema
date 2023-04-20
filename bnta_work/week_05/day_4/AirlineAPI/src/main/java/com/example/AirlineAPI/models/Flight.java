package com.example.AirlineAPI.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column
    private String destination;

    @Column
    private int capacity;

    @Column
    private String departureDate;

    @Column
    private String departureTime;

    private List<Passenger> passengers;

    public Flight(String destination, String departureDate, String departureTime){
        this.destination = destination;
        this.capacity = 0;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public List<Passenger> getPassengers(){
        return passengers;
    }


    {
    }
}
