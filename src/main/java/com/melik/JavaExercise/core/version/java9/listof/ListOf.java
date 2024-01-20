package com.melik.JavaExercise.core.version.java9.listof;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author mselvi
 * @Created 15.07.2023
 */

public class ListOf {

    public static void main(String[] args) {

        beforeListOf();


        afterListOf();
    }

    private static void afterListOf() {
        List<String> fruits = List.of("Apple", "Banana", "Orange");
        System.out.println(fruits);
    }

    private static void beforeListOf() {
        List<String> fruits = Collections.unmodifiableList(Arrays.asList("Apple","Banana","Orange"));
        System.out.println(fruits);
    }
}
