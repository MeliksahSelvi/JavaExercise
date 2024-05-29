package com.melik.JavaExercise.core.collections.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Author mselvi
 * @Created 29.05.2024
 */

public class TreeMapExample {

    public static void main(String[] args) {

        /*
         * TreeMap'ler varsayılan olarak küçükten büyüğe sıralama yapar.
         * Kendimiz bir comparator da verebiliriz.
         * Element add,delete,search için Big O notation logn'dir.
         * */
        TreeMap<String,Integer> treeMap=new TreeMap<>();
        treeMap.put("kerem",15);
        treeMap.put("mehmet",15);
        treeMap.put("ali",15);

        System.out.println(treeMap);

        Comparator<String> reverseComparator=(o1, o2) -> o2.compareTo(o1);

        TreeMap<String,Integer> treeMapWithComparator=new TreeMap<>(reverseComparator);
        treeMapWithComparator.put("kerem",15);
        treeMapWithComparator.put("mehmet",15);
        treeMapWithComparator.put("ali",15);

        System.out.println(treeMapWithComparator);
    }
}
