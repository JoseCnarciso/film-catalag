package com.mentorama.filmcatalag.dtos;

import java.sql.Date;

public class MoviesDTO {

    private Integer id;
    private String movieTitle;
    private String directorsName;
    private Date releaseYear;
    private Integer note;



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

    @Override
    public String toString() {
        return "MoviesDTO{" +
                "id=" + id +
                ", movieTitle='" + movieTitle + '\'' +
                ", directorsName='" + directorsName + '\'' +
                ", releaseYear=" + releaseYear +
                ", note=" + note +
                '}';
    }
}
