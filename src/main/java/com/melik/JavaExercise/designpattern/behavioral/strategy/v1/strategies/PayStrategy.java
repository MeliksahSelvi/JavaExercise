package com.melik.JavaExercise.designpattern.behavioral.strategy.v1.strategies;

public interface PayStrategy {

    void collectPaymentDetails();

    boolean pay(double paymentAmount);
}
