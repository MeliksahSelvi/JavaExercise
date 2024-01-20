package com.melik.JavaExercise.core.version.java15.instanceoff;

/**
 * @Author mselvi
 * @Created 14.07.2023
 */

/*
* Gelen yeni özellik ile instanceof kullanımında manuel olarak yaptığımız local field atama ve bu atamanın gerektirdiği
* cast işlemi if branch içerisinde otomatik yapılabiliyor.
* */
public class InstanceOff {

    public static void main(String[] args) {

        Cleaner cleaner = new Cleaner("ali", "veli", 1000);
        Manager manager = new Manager("koray", "demir", 2500, 750);

        beforeFeaturesCalculateSalary(cleaner);
        beforeFeaturesCalculateSalary(manager);

        afterFeaturesCalculateSalary(cleaner);
        afterFeaturesCalculateSalary(manager);
    }

    private static void beforeFeaturesCalculateSalary(Employee employee) {

        if (employee instanceof Cleaner) {
            Cleaner cleaner = (Cleaner) employee;
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
        }
    }

    private static void afterFeaturesCalculateSalary(Employee employee) {

        if (employee instanceof Cleaner cleaner) {

        } else if (employee instanceof Manager manager) {

        }
    }
}
