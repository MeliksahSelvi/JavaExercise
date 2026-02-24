package com.melik.JavaExercise.tdd.deneme;

public record Order(Money totalAmount, double weight, boolean isPremiumUser, double destinationKm) {
}
