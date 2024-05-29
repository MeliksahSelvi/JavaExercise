package com.melik.JavaExercise.core.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @Author mselvi
 * @Created 29.05.2024
 */

public class LinkedHashMapVsHashMap {

    public static void main(String[] args) {

        /*
        * Normal HashMap yapısında elemanları yerleştirme sırası biz o elemanları alırken korunmuyor.
        * Fakat LinkedHashMap arka planda bir LinkedList kullandığı için yerleştirme sırası muhafaza ediliyor.
        * */
        HashMap<String,Integer> hashMap=new HashMap<>();

        /*
        * Elaman ekleme,silme,arama için Big-o notation'u o(1)'dir.
        * */
        hashMap.put("ali",25);
        hashMap.put("veli",15);
        hashMap.put("mehmet",40);

        System.out.println(hashMap);

        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("ali",25);
        linkedHashMap.put("veli",15);
        linkedHashMap.put("mehmet",40);

        System.out.println(linkedHashMap);
    }
}
