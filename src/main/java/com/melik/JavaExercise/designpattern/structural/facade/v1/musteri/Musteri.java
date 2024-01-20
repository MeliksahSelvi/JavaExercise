package com.melik.JavaExercise.designpattern.structural.facade.v1.musteri;

public class Musteri {

    private String name;
    private String surName;

    public Musteri(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
