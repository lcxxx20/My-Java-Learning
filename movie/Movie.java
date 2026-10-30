package com.movie;
public class Movie{
    private String moviename;
    private String movietime;
    private String moviepeople;
    private String moviecountry;
    public Movie() {
    }
    public Movie(String moviename, String movietime, String moviepeople, String moviecountry) {
        this.moviename = moviename;
        this.movietime = movietime;
        this.moviepeople = moviepeople;
        this.moviecountry = moviecountry;
    }
    public String getMoviename() {
        return moviename;
    }
    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }
    public String getMovietime() {
        return movietime;
    }
    public void setMovietime(String movietime) {
        this.movietime = movietime;
    }
    public String getMoviepeople() {
        return moviepeople;
    }
    public void setMoviepeople(String moviepeople) {
        this.moviepeople = moviepeople;
    }
    public String getMoviecountry() {
        return moviecountry;
    }
    public void setMoviecountry(String moviecountry) {
        this.moviecountry = moviecountry;
    }
    public String toString() {
        return "Movie{moviename = " + moviename + ", movietime = " + movietime + ", moviepeople = " + moviepeople + ", moviecountry = " + moviecountry + "}";
    }
}
