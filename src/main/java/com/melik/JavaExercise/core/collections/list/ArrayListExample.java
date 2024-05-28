package com.melik.JavaExercise.core.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author mselvi
 * @Created 28.05.2024
 */

public class ArrayListExample {

    public static void main(String[] args) {

    }

    private static void filterAction() {
        /*
        * Burada list yapısını sadece first yapısındaki elemanları içerecek şekilde filtreledik.
        * */
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(10);
        list.retainAll(first);
        list.forEach(System.out::println);
    }
}
