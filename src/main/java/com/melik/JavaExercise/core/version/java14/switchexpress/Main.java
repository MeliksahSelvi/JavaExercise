package com.melik.JavaExercise.core.version.java14.switchexpress;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class Main {
    public static void main(String[] args) {
        String day = "SUNDAY";
        switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println("Weekday");
            case "SATURDAY", "SUNDAY" -> System.out.println("Weekend");
        }
    }
}
