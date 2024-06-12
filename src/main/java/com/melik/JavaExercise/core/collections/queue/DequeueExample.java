package com.melik.JavaExercise.core.collections.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author mselvi
 * @Created 12.06.2024
 */

public class DequeueExample {

    public static void main(String[] args) {

        /*
        * Queue'den farkı hem başa hem sona ekleme,çıkarma işlemi yapabiliriz.
        * */
        Deque<Integer> deque=new LinkedList<>();

        deque.addFirst(1);
        deque.offerFirst(1);

        deque.addLast(2);
        deque.offerLast(2);

        deque.pollFirst();
        deque.removeFirst();

        deque.pollLast();
        deque.removeLast();

        deque.getFirst();
        deque.peekFirst();

        deque.getLast();
        deque.peekLast();


    }
}
