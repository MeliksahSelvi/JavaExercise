package com.melik.JavaExercise.solid.liskovsubstitution.suitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

public class Square implements Shape {

    private int edge;

    public Square() {
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public int getArea() {
        return edge > 0 ? edge * edge : 0;
    }
}
