package com.melik.JavaExercise.tdd;

import java.math.BigDecimal;

public class ShippingService {

    private static final Money BASE_COST = new Money("50");
    private static final Money PREMIUM_DISCOUNT_MULTIPLIER = new Money("0.2");
    private static final double FREE_WEIGHT_THRESHOLD = 5.0;
    private static final Money EXTRA_WEIGHT_COST_PER_KG = new Money("10");
    private static final double FREE_DESTINATION_THRESHOLD = 10.0;
    private static final Money EXTRA_DESTINATION_MULTIPLIER = new Money("0.5");
    private static final Money FREE_AMOUNT_THRESHOLD = new Money("1000");

    public Money calculateShippingCost(Order order) {
        if (order.totalAmount().isLowerThanZero()) {
            throw new IllegalArgumentException();
        }

        if (order.weight() < 0.0) {
            throw new IllegalArgumentException();
        }

        if (order.totalAmount().greaterOrEqual(FREE_AMOUNT_THRESHOLD)) {
            return new Money("0");
        }

        Money cost = BASE_COST;
        if (order.weight() > FREE_WEIGHT_THRESHOLD) {
            var weightDiff = new Money(order.weight() - FREE_WEIGHT_THRESHOLD);
            cost = cost.add(EXTRA_WEIGHT_COST_PER_KG.multiply(weightDiff));
        }

        if (order.destinationKm() > FREE_DESTINATION_THRESHOLD) {
            cost = cost.add(cost.multiply(EXTRA_DESTINATION_MULTIPLIER));
        }

        if (order.isPremiumUser()) {
            cost = cost.subtract(cost.multiply(PREMIUM_DISCOUNT_MULTIPLIER));
        }

        return cost;
    }
}
