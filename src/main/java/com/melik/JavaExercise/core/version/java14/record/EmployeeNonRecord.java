package com.melik.JavaExercise.core.version.java14.record;

import java.util.Objects;

public class EmployeeNonRecord {

    private String name;
    private String surName;

    public EmployeeNonRecord(String name, String surName) {
        this.name = name;
        this.surName = surName;
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

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;
        EmployeeNonRecord employeeNonRecord = (EmployeeNonRecord) obj;
        return Objects.equals(name, employeeNonRecord.name) && Objects.equals(surName, employeeNonRecord.surName);
    }
}
