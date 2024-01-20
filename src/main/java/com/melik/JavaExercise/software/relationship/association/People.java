package com.melik.JavaExercise.software.relationship.association;

/*
* People ile Food arasında Association ilişkisi vardır.Yani kullanıp bırakma gibi.Tam bir bütünsellik yok.O an food nesnesini kullanıyor
* ama sonra başka bir food nesnesini kullanabilir.food nesnesi bitiğinde People var olmaya devam ediyor sonra başka bir food nesnesini kullanıyor.
* */
public class People {

    public void eat(Food food) {
        System.out.println("Ali eat " + food.getName() + " today");
    }
}
