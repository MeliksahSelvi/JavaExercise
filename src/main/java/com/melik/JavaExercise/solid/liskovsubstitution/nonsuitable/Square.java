package com.melik.JavaExercise.solid.liskovsubstitution.nonsuitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(int edge) {
        super(edge, edge);
    }

    @Override
    public void setHeight(int edge) {
        super.setHeight(edge);
        super.setWidth(edge);
    }

    @Override
    public void setWidth(int edge) {
        super.setWidth(edge);
        super.setHeight(edge);
    }
}
