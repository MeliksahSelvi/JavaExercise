package com.melik.JavaExercise.core.collections.set;

import java.util.*;

/**
 * @Author mselvi
 * @Created 28.05.2024
 */

public class LinkedHashSetExample {

    public static void main(String[] args) {

        /*
         * Normal Set yapısında koyduğumuz veriler veriliş sırasına göre tutma kuralına sahip değil.
         * Yani bize element'leri verirken ilk ekleme sırasına uyma garantisi yok.
         * Fakat LinkedHashSet'ler eklenme sırasına uyma garantisi var.
         * */
        Set<String > integerHashSet=new HashSet<>();
        integerHashSet.add("ali");
        integerHashSet.add("veliveli");
        integerHashSet.add("mehmet");
        integerHashSet.add("kerem");
        Iterator<String> hashSetIterator = integerHashSet.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }
        System.out.println();

        LinkedHashSet<String> integerLinkedHashSet=new LinkedHashSet<>();
        integerLinkedHashSet.add("ali");
        integerLinkedHashSet.add("veliveli");
        integerLinkedHashSet.add("mehmet");
        integerLinkedHashSet.add("kerem");
        Iterator<String> linkedHashSetIterator = integerLinkedHashSet.iterator();
        while (linkedHashSetIterator.hasNext()) {
            System.out.println(linkedHashSetIterator.next());
        }
    }
}
