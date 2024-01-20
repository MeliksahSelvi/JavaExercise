package com.melik.JavaExercise.core.version.java15.instanceoff;

/**
 * @Author mselvi
 * @Created 14.07.2023
 */

public class Manager extends Employee{

    private int bonusSalary;

    public Manager(String name, String surName, int salary, int bonusSalary) {
        super(name, surName, salary);
        this.bonusSalary = bonusSalary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }
}
