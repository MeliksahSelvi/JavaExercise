package com.melik.JavaExercise.core.reflections;

import jdk.jfr.Label;
import jdk.jfr.MemoryAddress;

import javax.annotation.processing.Generated;
import java.beans.Transient;
import java.io.Serial;
import java.util.Date;

public class Employee extends Human {

    private String fullName = "Ali";
    public String name;
    private String surName;
    private String job;
    private String age;

    public Employee(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Employee(String name, String surName, String job, Date birthDate) {
        this.name = name;
        this.surName = surName;
        this.job = job;
    }

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String methodInvoke() {
        return "ALi";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Transient
    public String getName() {
        return name;
    }

    @Serial
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value = "generated")
    public String getSurName() {
        return surName;
    }

    @MemoryAddress
    @Label(value = "label")
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
