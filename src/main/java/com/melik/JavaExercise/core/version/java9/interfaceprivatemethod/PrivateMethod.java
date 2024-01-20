package com.melik.JavaExercise.core.version.java9.interfaceprivatemethod;

import java.math.BigDecimal;

/**
 * @Author mselvi
 * @Created 15.07.2023
 */

/*
* Java 9 İle gelen özellik ile artık interface'lerde private method yazılabiliyor.
* */
public interface PrivateMethod {

    default BigDecimal calculateSalary(int yearOfWorks){

        BigDecimal zero = checkYearOfWorks(yearOfWorks);
        if (zero != null) return zero;

        BigDecimal perSalary=new BigDecimal(1.5);
        BigDecimal yearOfWorksBigDecimal = new BigDecimal(yearOfWorks);
        
        BigDecimal salary=perSalary.multiply(yearOfWorksBigDecimal);
        return salary;
    }

    private BigDecimal checkYearOfWorks(int yearOfWorks) {
        if (yearOfWorks <1){
            return BigDecimal.ZERO;
        }
        return null;
    }
}
