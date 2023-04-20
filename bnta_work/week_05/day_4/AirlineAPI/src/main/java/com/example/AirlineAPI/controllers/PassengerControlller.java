package com.example.AirlineAPI.controllers;

import com.example.AirlineAPI.models.Passenger;
import com.example.AirlineAPI.services.PassengerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("passengers")
public class PassengerControlller {

    @Autowired
    PassengerService passengerService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Passenger> getPassenger(@PathVariable Long id){
        return new ResponseEntity<>(passengerService.findPassenger(id), HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Long> removePassenger(@PathVariable Long id){
        passengerService.removePassenger(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
