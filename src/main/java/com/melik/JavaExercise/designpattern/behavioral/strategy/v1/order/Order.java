package com.melik.JavaExercise.designpattern.behavioral.strategy.v1.order;

import com.melik.JavaExercise.designpattern.behavioral.strategy.v1.strategies.PayStrategy;

public class Order {

    private double totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Here we could collect and store payment data from the strategy.
    }

    public void setTotalCost(double cost) {
        this.totalCost += cost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
