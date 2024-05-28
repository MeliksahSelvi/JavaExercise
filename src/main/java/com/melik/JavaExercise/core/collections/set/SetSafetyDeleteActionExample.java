package com.melik.JavaExercise.core.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author mselvi
 * @Created 28.05.2024
 */

public class SetSafetyDeleteActionExample {
    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);

        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next==3){
                iterator.remove();
            }
        }
        integerSet.forEach(System.out::println);

    }
}
