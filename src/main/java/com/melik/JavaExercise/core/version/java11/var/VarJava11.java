package com.melik.JavaExercise.core.version.java11.var;

import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class VarJava11 {
    public static void main(String[] args) {

        List.of(2,3).stream()
                .sorted((@NonNull var o1, var o2) -> o1.compareTo(o2));
    }
}
