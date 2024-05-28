package com.melik.JavaExercise.core.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author mselvi
 * @Created 28.05.2024
 */

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        /*
         * The big-o notation of element addition is O(1) or O(N)
         * O(1) validate when we are trying to add elements to arraylist that has not reached first initial capacity.
         * O(N) validate when we are trying to add elements to arraylist that needs to expand the array that is uses in the background
         * */
        list.add(1);
        list.add(2);

        /*
         * The big-o notation of element search is O(1).
         * Because we don't need to iterate all list
         * */
        list.contains(1);
        list.indexOf(2);

        LinkedList<Integer> linkedList = new LinkedList<>();

        /*
         * The big-o notation of element addition is O(1)
         * Because we don't have any capacity for our LinkedList as with ArrayList
         * */
        linkedList.add(1);
        linkedList.add(2);


        /*
         * The big-o notation of element search is O(N).
         * Because we have to iterate all list when we are trying to add elements to linkedlist
         * */
        linkedList.contains(1);
        linkedList.indexOf(1);
    }
}
