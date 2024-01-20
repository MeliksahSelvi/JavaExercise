package com.melik.JavaExercise.solid.dependencyinversion;


/*
* Burada Key Üst Seviye Bir Class.Arabanın türüne bağlı olmadan çalışıyor.
* Dependency Inversion'da üst seviyeli class'lar alt seviyeli Class'lara bağımlı olmamalı.
* Bizim Key Class'ımız Runnable interfacesi ile soyut bir yere bağlı olmuş oluyor.Yani Key, Runnable'ı
* implements eden her bir SubClass ile çalışabilir.
*
* */
public class Test {
    public static void main(String[] args) {

        ClassicCar classicCar=new ClassicCar("Classic Car");

        Key key=new Key(classicCar);
        key.turnKey();
        key.turnKey();
        key.turnKey();

        System.out.println();

        SportCar sportCar=new SportCar("Sport Car");

        key=new Key(sportCar);
        key.turnKey();
        key.turnKey();
        key.turnKey();
    }
}
