package com.melik.JavaExercise.core.version.java8.functionalinterface.function;

import java.util.List;
import java.util.function.Function;

/**
 * @Author mselvi
 * @Created 08.07.2023
 */


/*
* Verilen nesnenin türünü değiştirmek için kullanılır.Tek parametre alır.
 * 2 parametre alan subtype'ları vardır mesela BiFunction
* */
public class FunctionExample {

    public static void main(String[] args) {

//        exampleV1();

        exampleV2();
    }

    private static void exampleV2() {
        /*
        * Stream'in map fonksiyonu function alır.
        * */
        List<String> names=List.of("ali","veli","mehmet");

        Function<String,Integer> strLengthFunction=str ->str.length();

        names.stream().map(strLengthFunction).forEach(i -> System.out.println(i));
    }

    private static void exampleV1() {
        Function<String,Integer> functionWithLambda= str ->Integer.parseInt(str);

        Function<String,Integer> functionWithMethodReference= Integer::parseInt;


        Integer lambdaNumber = functionWithLambda.apply("15");
        Integer methodReferenceNumber= functionWithMethodReference.apply("798");

        System.out.println(lambdaNumber+methodReferenceNumber);
    }
}
