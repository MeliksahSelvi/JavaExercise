package com.melik.JavaExercise.core.collections.set;

import java.util.HashSet;

/**
 * @Author mselvi
 * @Created 28.05.2024
 */

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String > stringHashSet=new HashSet<>();

        /*
         * The big-o notation of element addition is O(1) or O(N)
         * O(1) validate on normal scenarios
         * O(N) validate on scenario that happen hashing collision too many
         * */
        stringHashSet.add("1");
        stringHashSet.add("2");
        stringHashSet.add("3");


        /*
         * The big-o notation of element delete is O(1) or O(N)
         * O(1) validate on normal scenarios
         * O(N) validate on scenario that happen hashing collision too many
         * */
        stringHashSet.remove("1");

        /*
         * The big-o notation of element search is O(1) or O(N)
         * O(1) validate on normal scenarios
         * O(N) validate on scenario that happen hashing collision too many
         * */
        stringHashSet.contains("1");

    }
}
