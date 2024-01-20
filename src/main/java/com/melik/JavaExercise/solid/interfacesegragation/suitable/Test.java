package com.melik.JavaExercise.solid.interfacesegragation.suitable;

/**
 * @Author mselvi
 * @Created 06.07.2023
 */

/*
* Animal interfacesini 3 interface'ye böldük. Bu sayede her bir concrete class ihtiyacı olduğu interface'yi kullanarak sadece
* implement etmek isteyeceği methodları implement edicek. Yapımız Interface segragation prensibine uygun hale geldi.
*
* */
public class Test {

    public static void main(String[] args) {

        Flyable bird=new Bird();
        bird.fly();
        bird.live();

        Barkable dog=new Dog();
        dog.live();
        dog.bark();

        Livable fox=new Fox();
        fox.live();
    }
}
