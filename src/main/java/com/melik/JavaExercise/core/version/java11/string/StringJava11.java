package com.melik.JavaExercise.core.version.java11.string;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class StringJava11 {
    public static void main(String[] args) {
        transformString();
        indentString();
    }

    private static void indentString() {
        String  result="message received";
        System.out.println(result);
        System.out.println(result.indent(8));
    }

    private static void transformString() {
        String names = "ali,veli,mehmet";
        Function<String, List<String>> splitFunction = str -> Arrays.asList(str.split(","));
        List<String> transform = names.transform(splitFunction);
        transform.forEach(System.out::println);
    }
}
