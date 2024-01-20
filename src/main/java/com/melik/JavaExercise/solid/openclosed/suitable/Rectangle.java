package com.melik.JavaExercise.solid.openclosed.suitable;

/**
 * @Author mselvi
 * @Created 03.07.2023
 */

public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (width < 0 || height < 0) ? 0 : (width * height);
    }
}
