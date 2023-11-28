package com.example.netflux.boostrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.netflux.domain.Movie;
import com.example.netflux.repo.MovieRepo;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Component
public class InitMovies implements CommandLineRunner{
    private final MovieRepo movieRepo;
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        movieRepo.deleteAll().thenMany(Flux.just("Return Of The Jedi", "Revenge Of The Sith", "Star Wars", 
        "The Manadolorian", "Scream", "Harry Potter", "Spiderman", "Transformers")
        .map(title -> new Movie(title))
        .flatMap(movieRepo::save)
        ).subscribe(null, null, ()->{
            movieRepo.findAll().subscribe(System.out::println);
        });

    }
    
    
}
