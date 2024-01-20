package com.melik.JavaExercise.solid.liskovsubstitution.nonsuitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return (height > 0 && width > 0) ? (height * width) : 0;
    }
}
