package com.melik.JavaExercise.tdd.deneme;

import java.math.BigDecimal;
import java.math.RoundingMode;

public record Money(BigDecimal value) {

    public Money(String value) {
        this(new BigDecimal(value).setScale(2, RoundingMode.HALF_UP));
    }

    public Money(double value){
        this(new BigDecimal(value).setScale(2,RoundingMode.HALF_UP));
    }

    public boolean isLowerThanZero() {
        return value.compareTo(BigDecimal.ZERO) < 0;
    }

    public boolean greaterOrEqual(Money other) {
        return value.compareTo(other.value) >= 0;
    }

    public Money add(Money other) {
        return new Money(value.add(other.value).setScale(2,RoundingMode.HALF_UP));
    }

    public Money multiply(Money other){
        return new Money(value.multiply(other.value).setScale(2,RoundingMode.HALF_UP));
    }

    public Money subtract(Money other){
        return new Money(value.subtract(other.value).setScale(2,RoundingMode.HALF_UP));
    }
}
