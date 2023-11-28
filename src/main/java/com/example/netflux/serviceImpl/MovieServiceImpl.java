package com.example.netflux.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.netflux.domain.Movie;
import com.example.netflux.repo.MovieRepo;
import com.example.netflux.service.MovieService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepo movieRepo;

    @Override
    public Mono<Movie> getMovieById(String id) {
        // TODO Auto-generated method stub
        return movieRepo.findById(id);
    }

    @Override
    public Flux<Movie> getAllMovies() {
        // TODO Auto-generated method stub
        return movieRepo.findAll();
    }
    
}
