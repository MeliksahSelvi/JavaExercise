package com.melik.JavaExercise.designpattern.structural.adapter.v1.square;

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(getWidth(), 2);
        return result;
    }
}
