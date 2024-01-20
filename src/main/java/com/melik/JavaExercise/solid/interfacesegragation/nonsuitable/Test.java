package com.melik.JavaExercise.solid.interfacesegragation.nonsuitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

/*
* Hem Bird hem Dog hem Fox Animal interfacesinden türetildi.Anlam olarak 3 class'da Animal olabilir. Fakat Animal interfacesine
* eklediğimiz methodlar her bir class için uygun değil. Mesela Fox bark() methodunu kullanmıyor. Ona rağmen onu bu methodu implement
* etmeye zorladık. Interface segragation prensibine göre interfaceler kendisini implement eden class'lara kullanmadıkları methodları
* kullanmaya zorlamamalıdır. Prensibi ihlal ettik.
* */
public class Test {
    public static void main(String[] args) {

        Animal bird=new Bird();
        bird.live();
        bird.fly();
        bird.bark();

        Animal dog=new Dog();
        dog.live();
        dog.fly();
        dog.bark();

        Animal fox=new Fox();
        fox.live();
        fox.fly();
        fox.bark();
    }
}
