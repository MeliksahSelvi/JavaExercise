package com.melik.JavaExercise.core.thread.basic;

/**
 * @Author mselvi
 * @Created 27.01.2024
 */

public class BasicThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();
        worker.start();
    }

    static class Worker extends Thread {
        @Override
        public void run() {
            System.out.println("Ben çalışıyorum , Thread name: " + Thread.currentThread().getName());
        }
    }
}


