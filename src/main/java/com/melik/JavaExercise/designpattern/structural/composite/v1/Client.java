package com.melik.JavaExercise.designpattern.structural.composite.v1;

import com.melik.JavaExercise.designpattern.structural.composite.v1.container.MovieContainer;
import com.melik.JavaExercise.designpattern.structural.composite.v1.movie.Movie;
import com.melik.JavaExercise.designpattern.structural.composite.v1.movie.Romantic;
import com.melik.JavaExercise.designpattern.structural.composite.v1.movie.Thriller;

import java.util.Date;

/*
 * Client tüm Movie türlerine ulaşmak için tek tek uğraşmadı, bileşik nesne olan MovieContainer üzerinden tüm Movie'lere erişim sağladı.
 * Client leaf nesneye de (Thriller,Romantic) veya bileşik nesneye de (MovieContainer) aynı şekilde ulaşabiliyor. Tek bir film üzerinden veya
 * film türü üzerinden işlem yapabiliyor.Bu sayade bu yapıyı oluşturan somut class'lara bağlanmadan karmaşık nesne yapılarıyla birlikte çalışabilir.
 * Client En tepedeki MovieContainerdan tek methodla tüm filmleri listeleyebiliyor.
 * Bir nevi Tree veri yapısı gibi en tepedeki node'dan tüm node'lara erişebiliyor veya ekleme çıkarma yapabiliyor.
 * */

public class Client {
    public static void main(String[] args) {

        MovieContainer thrillerContainer = new MovieContainer(
                new Thriller("Thriller1", new Date(), 4.0),
                new Thriller("Thriller2", new Date(), 2.9)
        );

        MovieContainer romanticContainer = new MovieContainer(
                new Romantic("Romantic1", new Date(), 4.8),
                new Romantic("Romantic2", new Date(), 4.2)
        );

        MovieContainer mainContainer = new MovieContainer();
        mainContainer.addMovie(thrillerContainer, romanticContainer);

        Movie movie = new Thriller("Thriller3", new Date(), 2.9);

        mainContainer.addMovie(movie);

        mainContainer.addMovie(new Romantic("Romantic3", new Date(), 4.7));

        mainContainer.showMovieInfo();

    }
}
