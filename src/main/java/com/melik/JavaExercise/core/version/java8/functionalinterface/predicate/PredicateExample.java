package com.melik.JavaExercise.core.version.java8.functionalinterface.predicate;

import java.util.List;
import java.util.function.Predicate;

/**
 * @Author mselvi
 * @Created 08.07.2023
 */

/*
* verilen condition'a göre boolean bir değer döndürür.Tek parametre alır.
 * 2 parametre alan subtype'ları vardır mesela BiPredicate
*
* */
public class PredicateExample {

    public static void main(String[] args) {

        List<String> names=List.of("ali","veli","mehmet");

        Predicate<String> filterPredicate=(String element) ->element.startsWith("a");

        names.stream().filter(filterPredicate).forEach(s -> System.out.println(s));


    }



}
