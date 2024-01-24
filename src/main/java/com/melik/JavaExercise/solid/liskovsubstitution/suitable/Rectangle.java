package com.melik.JavaExercise.solid.liskovsubstitution.suitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

public class Rectangle implements Shape{

    private int height;
    private int width;

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return (height > 0 && width > 0) ? (height * width) : 0;
    }
}
