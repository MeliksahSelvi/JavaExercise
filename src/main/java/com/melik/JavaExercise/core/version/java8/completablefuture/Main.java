package com.melik.JavaExercise.core.version.java8.completablefuture;

import java.util.concurrent.CompletableFuture;

/**
 * @Author mselvi
 * @Created 04.09.2023
 */

public class Main {
    public static void main(String[] args) {

        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println("Async thread is running");
            }
        });


    }
}
