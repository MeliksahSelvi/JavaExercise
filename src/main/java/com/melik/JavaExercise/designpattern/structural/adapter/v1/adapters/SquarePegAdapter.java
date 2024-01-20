package com.melik.JavaExercise.designpattern.structural.adapter.v1.adapters;

import com.melik.JavaExercise.designpattern.structural.adapter.v1.round.RoundPeg;
import com.melik.JavaExercise.designpattern.structural.adapter.v1.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        double pow = Math.pow((squarePeg.getWidth() / 2), 2);
        result = (Math.sqrt(pow * 2));
        return result;
    }
}
