package com.melik.JavaExercise.core.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author mselvi
 * @Created 12.06.2024
 */

public class PriorityQueueExample {

    public static void main(String[] args) {

        /*
         * PriorityQueue'ler varsayılan olarak küçükten büyüğe sıralama yapar.
         * Kendimiz bir comparator da verebiliriz.
         * */
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("ali");
        priorityQueue.add("alii");
        priorityQueue.add("aliii");
        priorityQueue.add("aliiii");

        System.out.println(priorityQueue);

        Comparator<String> reverseComparator = Comparator.reverseOrder();

        PriorityQueue<String> priorityQueueWithComparator = new PriorityQueue<>(reverseComparator);
        priorityQueueWithComparator.add("ali");
        priorityQueueWithComparator.add("alii");
        priorityQueueWithComparator.add("aliii");
        priorityQueueWithComparator.add("aliiii");

        System.out.println(priorityQueueWithComparator);
    }
}
