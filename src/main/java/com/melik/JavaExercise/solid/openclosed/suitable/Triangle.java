package com.melik.JavaExercise.solid.openclosed.suitable;

/**
 * @Author mselvi
 * @Created 03.07.2023
 */

public class Triangle implements Shape {

    private int height;
    private int bottomEdge;

    public Triangle(int height, int bottomEdge) {
        this.height = height;
        this.bottomEdge = bottomEdge;
    }

    @Override
    public int getArea() {
        return (height < 0 || bottomEdge < 0) ? 0 : ((height * bottomEdge) / 2);
    }
}
