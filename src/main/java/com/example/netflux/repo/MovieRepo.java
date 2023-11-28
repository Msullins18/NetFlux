package com.example.netflux.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.netflux.domain.Movie;

@Repository
public interface MovieRepo extends ReactiveMongoRepository<Movie, String>{
    
}
