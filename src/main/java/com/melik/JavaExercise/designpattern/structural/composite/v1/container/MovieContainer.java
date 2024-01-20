package com.melik.JavaExercise.designpattern.structural.composite.v1.container;

import com.melik.JavaExercise.designpattern.structural.composite.v1.movie.BaseMovie;
import com.melik.JavaExercise.designpattern.structural.composite.v1.movie.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MovieContainer extends BaseMovie {

    private List<Movie> movieList = new ArrayList<>();

    public MovieContainer(Movie... movies) {
        super("-", new Date(), 0.0);
        addMovie(movies);
    }

    @Override
    public void showMovieInfo() {
        for (Movie movie : movieList) {
            movie.showMovieInfo();
        }
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void addMovie(Movie... movies) {
        movieList.addAll(Arrays.asList(movies));
    }

    public void removeMovie(Movie movie) {
        movieList.remove(movie);
    }

    public void removeMovie(Movie... movies) {
        movieList.removeAll(Arrays.asList(movies));
    }
}
