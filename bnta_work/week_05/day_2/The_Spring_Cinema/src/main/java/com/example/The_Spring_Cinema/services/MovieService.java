package com.example.The_Spring_Cinema.services;

import com.example.The_Spring_Cinema.models.Movie;
import com.example.The_Spring_Cinema.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
    public Movie getMovieById(int id){
        return movieRepository.findById(id).orElse(null);
    }
    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public MovieService() {

    }
}
