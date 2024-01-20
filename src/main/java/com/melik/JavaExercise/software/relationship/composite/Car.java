package com.melik.JavaExercise.software.relationship.composite;

/*
* Car ile Engine arasında composition ilişkisi vardır.Yaşam döngüleri birbirleri ile bağlantılıdır. Ayrıldıklarında tek başlarınabir anlam ifade
* etmeyen ilişki. Yani motorsuz araba ve arabasız motor olamayacağı gibi ancak beraberlerse birbirleri için bir anlamları vardır.
* */
public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = new Engine();
    }
}
