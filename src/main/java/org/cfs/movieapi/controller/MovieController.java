package org.cfs.movieapi.controller;

import org.cfs.movieapi.entity.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieController {
    Map<Long, Movie> movieDB = new HashMap<>();

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(@RequestBody Movie movie){
        return ResponseEntity.ok(new ArrayList<>(movieDB.values()));
    }
    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        movieDB.put(movie.getId(),movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(movie);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id){
        Movie existing = movieDB.get(id);
        if(existing == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(existing);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateMovie(@RequestBody Movie movie, @PathVariable Long id){
        Movie existing = movieDB.get(id);
        if(existing == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        movieDB.put(movie.getId(),movie);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PatchMapping("/{id}/rating")
    public ResponseEntity<Movie> updateByField(@PathVariable Long id, @RequestParam float newRating){
        Movie existing = movieDB.get(id);
        if(existing == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        existing.setRating(newRating);
        movieDB.put(id,existing);
        return ResponseEntity.ok(existing);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Movie> deleteMovie(@PathVariable Long id){
        Movie existing = movieDB.get(id);
        if(existing == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        movieDB.remove(id);
        return ResponseEntity.noContent().build();
    }
}
