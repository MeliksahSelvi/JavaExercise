package com.melik.JavaExercise.core.version.java8.methodreference;

import java.util.List;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class MethodReference {
    public static void main(String[] args) {
        List<String> list= List.of("ali","veli");
        //before method reference
        list.forEach(s -> s.toUpperCase());
        //after method reference
        list.forEach(String::toUpperCase);
    }
}
