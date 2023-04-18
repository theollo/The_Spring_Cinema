package com.example.The_Spring_Cinema.repository;

import com.example.The_Spring_Cinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
