package com.example.AirlineAPI.services;

import com.example.AirlineAPI.models.Passenger;
import com.example.AirlineAPI.repositories.FlightRepository;
import com.example.AirlineAPI.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;

    public Passenger findPassenger(Long id){
        return passengerRepository.findById(id).get();
    }

    public List<Passenger> findAllPassengers(){
        return passengerRepository.findAll();
    }

    //come back to this, it wants an int here, not sure what to do
//    public List<Passenger> findByName(String name){
//        return passengerRepository.findByName(name);
//    }

    public void removePassenger(Long id){
        passengerRepository.deleteById(id);
    }
}
