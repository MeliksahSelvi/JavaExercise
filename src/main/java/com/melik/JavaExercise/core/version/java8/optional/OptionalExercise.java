package com.melik.JavaExercise.core.version.java8.optional;

import java.util.Optional;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class OptionalExercise {
    public static void main(String[] args) {
        Optional<String> ali = Optional.of("ali");
        if (ali.isEmpty()) {
            System.out.println("değer boş");
        }

        if (ali.isPresent()) {
            System.out.println("değer dolu");
        }

        String deger = ali.orElseThrow(() -> new RuntimeException("değer boş"));
        deger = ali.orElse("değer boş olduğu için ben atandım");
        deger = ali.get();
    }
}
