package com.mentorama.filmcatalag.controllers;

import com.mentorama.filmcatalag.dtos.MoviesDTO;
import com.mentorama.filmcatalag.models.Movie;
import com.mentorama.filmcatalag.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity<String> addMovie( @RequestBody MoviesDTO moviesDTO){
        System.out.println(moviesDTO);

        Movie movie = new Movie();
        movie.setId(moviesDTO.getId());
        movie.setMovieTitle(moviesDTO.getMovieTitle());
        movie.setDirectorsName(moviesDTO.getDirectorsName());
        movie.setNote(moviesDTO.getNote());
        movie.setReleaseYear(moviesDTO.getReleaseYear());

        try {
            movieService.addMovie(movie);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/por-titulo/{movieTitle}")
    public Movie findByMovieTitle(@PathVariable ("movieTitle") String movieTitle){
        return movieService.findByMovieTitle(movieTitle);
    }

    @GetMapping("/{id}")
    public Movie findById( @PathVariable("id") Integer id){
        return movieService.findById(id);
    }

    @GetMapping
    public ResponseEntity<List<Movie>>findAll(){
        System.out.println("findAll()");
        return new ResponseEntity<>(movieService.findAll(),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById( @PathVariable("id") Integer id){
         movieService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
