package com.mentorama.filmcatalag.services;

import com.mentorama.filmcatalag.models.Movie;
import com.mentorama.filmcatalag.repositories.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService{
    @Autowired
    IMovieRepository iMovieRepository;

    public void addMovie( Movie movie ) throws Exception {
        List<Movie> todos = iMovieRepository.findAll();
        for (Movie movie1 : todos) {
            if (movie1.getMovieTitle().equalsIgnoreCase(movie.getMovieTitle()) &&
                            movie1.getDirectorsName().equalsIgnoreCase(movie.getDirectorsName()) &&
                            movie1.getReleaseYear().equals(movie.getReleaseYear())) {
                throw new Exception("Nao pode cadastrar filmes duplicados.");
            }
        }

        iMovieRepository.save(movie);
    }


    public Movie findByMovieTitle( String movieTitle ) {
        return iMovieRepository.findByMovieTitle(movieTitle);
    }

    public List<Movie>findAll(){
        return iMovieRepository.findAll();
    }

    public Movie findById(Integer id){
        return iMovieRepository.findAllById(id);
    }

    public void delete( Integer id ) {
        iMovieRepository.deleteById(id);

    }
}
