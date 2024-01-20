package com.melik.JavaExercise.core.version.java15.record;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
 * topThreeMovies methodunda record'un local olarak kullanımını gördük.Bir nevi Inner class gibi olurlar ama ondan daha iyi iş görür.Çünkü içinde
 * barındırdığı field'lar encapsulation ile saklanır vaziyettedir.Inner class'larda encapsulation yoktur.Burada record farklı methodlardan dönen
 * datalar harmanlanarak bir hesaplama yapılmak için kullanıldı.Burada movies ve score farklı servislerden gelen datalar.bu iki data aynı yapıda
 * tutularak tek bir yapıymış gibi stream api ile en çok puana sahip ilk 3 film listelendi.
 * */
public class Client {
    static List<Movie> movies = new ArrayList<>();

    public static void main(String[] args) {

        topThreeMovies();
    }

    private static List<Movie> topThreeMovies() {


        record MovieScore(Movie movie, int score) {
        }

        return movies.stream()
                .map(movie -> new MovieScore(movie, calculateScore()))
                .sorted(Comparator.comparingInt(MovieScore::score).reversed())
                .limit(3)
                .map(MovieScore::movie)
                .collect(Collectors.toList());
    }

    private static int calculateScore() {
        Random random = new Random();

        return random.nextInt();
    }
}
