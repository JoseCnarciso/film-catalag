package com.mentorama.filmcatalag.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name ="TB_MOVIES")
public class Movie implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String movieTitle;
    private String directorsName;
    private Date releaseYear;
    private Integer note;


    public Movie() {
    }

    public Movie( Integer id, String movieTitle, String directorsName, Date releaseYear, Integer note ) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.directorsName = directorsName;
        this.releaseYear = releaseYear;
        this.note = note;
    }


    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle( String movieTitle ) {
        this.movieTitle = movieTitle;
    }

    public String getDirectorsName() {
        return directorsName;
    }

    public void setDirectorsName( String directorsName ) {
        this.directorsName = directorsName;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear( Date releaseYear ) {
        this.releaseYear = releaseYear;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote( Integer note ) {
        this.note = note;
    }
}
