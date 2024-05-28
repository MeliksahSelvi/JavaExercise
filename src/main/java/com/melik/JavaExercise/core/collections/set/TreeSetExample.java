package com.melik.JavaExercise.core.collections.set;

import java.util.*;

/**
 * @Author mselvi
 * @Created 28.05.2024
 */

public class TreeSetExample {

    public static void main(String[] args) {

        /*
        * TreeSet'ler varsayılan olarak küçükten büyüğe sıralama yapar.
        * Kendimiz bir comparator da verebiliriz.
        * */

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("ali");
        treeSet.add("veliveli");
        treeSet.add("mehmetcik");
        treeSet.add("kerem");

        Iterator<String> treeSetIterator = treeSet.iterator();
        while (treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }
        System.out.println();
        Comparator<String> reverseComparator=(o1, o2) -> o2.compareTo(o1);

        TreeSet<String > treeSetWithComparator=new TreeSet<>(reverseComparator);
        treeSetWithComparator.add("ali");
        treeSetWithComparator.add("veliveli");
        treeSetWithComparator.add("mehmetcik");
        treeSetWithComparator.add("kerem");

        Iterator<String> treeSetWithComparatorIterator = treeSetWithComparator.iterator();
        while (treeSetWithComparatorIterator.hasNext()) {
            System.out.println(treeSetWithComparatorIterator.next());
        }
    }
}
