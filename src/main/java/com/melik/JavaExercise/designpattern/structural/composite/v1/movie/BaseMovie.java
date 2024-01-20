package com.melik.JavaExercise.designpattern.structural.composite.v1.movie;

import java.util.Date;

public abstract class BaseMovie implements Movie {

    private String name;
    private Date releaseDate;
    private double imdb;

    public BaseMovie(String name, Date releaseDate, double imdb) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.imdb = imdb;
    }

    @Override
    public void showMovieInfo() {
        System.out.println("Movie Name :" + name);
        System.out.println("Release Date :" + releaseDate);
        System.out.println("Imdb Point : " + imdb+"\n");
    }
}
