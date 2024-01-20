package com.melik.JavaExercise.software.relationship.aggregation;

/*
* Taxi ile Driver arasında aggregation ilişkisi vardır.Composition'a benzer aralarındaki bariz fark şudur:
* Tek başlarına da bir anlam ifade ederler. Ve aynı zamanda örneğimizde Taxi'nin Driver nesnesi değişebilir.
* */
public class Taxi {

    private Driver driver;

    public Taxi(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
