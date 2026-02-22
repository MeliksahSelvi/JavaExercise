package com.melik.JavaExercise.tdd;

public record Order(Money totalAmount, double weight, boolean isPremiumUser, double destinationKm) {
}
