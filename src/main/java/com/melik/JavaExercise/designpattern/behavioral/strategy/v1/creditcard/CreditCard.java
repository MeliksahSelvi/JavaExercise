package com.melik.JavaExercise.designpattern.behavioral.strategy.v1.creditcard;

public class CreditCard {

    private String number;
    private String date;
    private String cvv;
    private double amount;

    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.amount = 1000.0;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

