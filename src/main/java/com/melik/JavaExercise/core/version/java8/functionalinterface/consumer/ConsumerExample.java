package com.melik.JavaExercise.core.version.java8.functionalinterface.consumer;

import java.util.List;
import java.util.function.Consumer;

/**
 * @Author mselvi
 * @Created 08.07.2023
 */

/*
* Aldığı nesneyi tüketir üzerinde işlemler yapılabilir fakat herhangi bir sonuç döndürmez.Tek parametre alır.
* 2 parametre alan subtype'ları vardır mesela BiConsumer
* */
public class ConsumerExample {

    public static void main(String[] args) {

        examplev1();

        examplev2();
    }

    private static void examplev2() {

        /*
        * Iterable interfacesindeki foreach consumer alır.
        * */
        List<String> names=List.of("ali","veli","mehmet");

        names.forEach(e -> System.out.println(e));
    }

    private static void examplev1() {
        Consumer<String> consumer= (String msg) ->{
            System.out.println(msg);
        };

        consumer.accept("Hi World");
    }
}
