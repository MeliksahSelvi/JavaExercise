package com.melik.JavaExercise.core.version.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class StreamApi {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(5, 4, 9, 8, 12, 9, 6);

        integerStream.filter(integer -> integer % 2 == 0).forEach(System.out::println);

        List<String> stringList = integerStream.map(String::valueOf).collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }
}
