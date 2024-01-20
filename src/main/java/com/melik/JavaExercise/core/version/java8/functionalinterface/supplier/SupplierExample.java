package com.melik.JavaExercise.core.version.java8.functionalinterface.supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * @Author mselvi
 * @Created 08.07.2023
 */

/*
 * Argüman almadan bir veri döndürür.Stream'daki orelseget supplier alır.
 * */
public class SupplierExample {

    public static void main(String[] args) {

        exampleV1();

        exampleV2();

    }

    private static void exampleV2() {

        /*
         * Supplier'ın güzel bir kullanımı
         * */
        Supplier<String> supplier = () -> SupplierClass.buMethodunIsmiGercektenCokUzunHerCagirdigimYerdeKoduOkunmazYapacak();

        System.out.println(SupplierClass.buMethodunIsmiGercektenCokUzunHerCagirdigimYerdeKoduOkunmazYapacak());

        System.out.println(supplier.get());
    }

    private static void exampleV1() {
        Supplier<String> currentDateTime = () -> new Date().toString();

        System.out.println(currentDateTime.get());
    }
}
