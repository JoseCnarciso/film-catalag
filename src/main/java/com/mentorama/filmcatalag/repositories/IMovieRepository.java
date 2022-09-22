package com.mentorama.filmcatalag.repositories;

import com.mentorama.filmcatalag.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IMovieRepository extends JpaRepository<Movie,Integer> {

    Movie findByMovieTitle(String movieTitle);

    Movie findAllById(Integer id);

}
