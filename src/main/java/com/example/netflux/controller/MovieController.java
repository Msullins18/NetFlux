package com.example.netflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.netflux.domain.Movie;
import com.example.netflux.service.MovieService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/{id}")
    Mono<Movie> getMovieById(@PathVariable String id) {
        return movieService.getMovieById(id);
    }

    @GetMapping("/all")
    Flux<Movie> getAllMovies(String id) {
        return movieService.getAllMovies();
    }

}
