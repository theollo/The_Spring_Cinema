package com.example.AirlineAPI.controllers;

import com.example.AirlineAPI.models.Flight;
import com.example.AirlineAPI.repositories.FlightRepository;
import com.example.AirlineAPI.repositories.PassengerRepository;
import com.example.AirlineAPI.services.FlightService;
import com.example.AirlineAPI.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("flights")
public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    FlightService flightService;

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights(){
        return new ResponseEntity(flightRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Flight>> getFlight(@PathVariable Long id){
        return new ResponseEntity(flightRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<Flight>> postFight(@RequestBody Flight estate){
        flightRepository.save(estate);
        return new ResponseEntity(flightRepository.findAll(), HttpStatus.CREATED);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Long> cancelFlight(@PathVariable Long id){
        flightService.cancelFlight(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
