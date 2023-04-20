package com.example.AirlineAPI.services;

import com.example.AirlineAPI.models.Flight;
import com.example.AirlineAPI.models.Passenger;
import com.example.AirlineAPI.repositories.FlightRepository;
import com.example.AirlineAPI.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public void saveEstate(Flight flight){
        flightRepository.save(flight);
    }

    public Flight findFlight(Long id){
        return flightRepository.findById(id).get();
    }

    public List<Flight> findAllFlights(){
        return flightRepository.findAll();
    }
    public void cancelFlight(Long id){
        Flight flight = flightRepository.findById(id).get();
        for(Passenger passenger : flight.getPassengers()){
            passenger.removeFlight(flight);
            flightRepository.save(flight);
        }
        flightRepository.deleteById(id);
    }
}
