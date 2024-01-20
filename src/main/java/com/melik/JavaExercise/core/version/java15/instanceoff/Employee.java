package com.melik.JavaExercise.core.version.java15.instanceoff;

/**
 * @Author mselvi
 * @Created 14.07.2023
 */

public abstract class Employee {

    private String name;
    private String surName;
    private int salary;

    public Employee(String name, String surName, int salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getSalary() {
        return salary;
    }
}
