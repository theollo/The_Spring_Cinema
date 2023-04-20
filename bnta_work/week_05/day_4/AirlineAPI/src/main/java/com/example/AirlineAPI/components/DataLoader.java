package com.example.AirlineAPI.components;

import com.example.AirlineAPI.models.Flight;
import com.example.AirlineAPI.models.Passenger;
import com.example.AirlineAPI.repositories.FlightRepository;
import com.example.AirlineAPI.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception{

        //Paris
        Flight paris = new Flight("Paris","20/04/23","13:50");
        flightRepository.save(paris);

        Passenger theo = new Passenger("Theo Lloyd","theo@gmail.com");
        passengerRepository.save(theo);

        //Berlin
        Flight berlin = new Flight("Berlin","20/04/23","14:40");
        flightRepository.save(berlin);

        Passenger john = new Passenger("John Smith","John@gmail.com");
        passengerRepository.save(john);

        //Madrid
        Flight madrid = new Flight("Madrid","20/04/23","15:10");
        flightRepository.save(madrid);

        Passenger joe = new Passenger("Joe Blogs","Joe@gmail.com");
        passengerRepository.save(joe);

        theo.addFlight(paris);
        john.addFlight(berlin);
        joe.addFlight(madrid);

        passengerRepository.save(theo);
        passengerRepository.save(john);
        passengerRepository.save(joe);



    }


}
