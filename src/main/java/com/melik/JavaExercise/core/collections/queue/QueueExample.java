package com.melik.JavaExercise.core.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author mselvi
 * @Created 12.06.2024
 */

public class QueueExample {

    public static void main(String[] args) {
        /*
        * The data structures that implemented from Queue works on FIFO logic.
        * */
        Queue<Integer> queueExample = new LinkedList<>();

        queueExample.add(1);
        queueExample.offer(1);// add and offer do same action.if adding process be fail,offer() doesn't throw exception

        queueExample.remove();
        queueExample.poll();// remove and poll do same action.if queue doesnt include any member, poll() doesn't throw exception

        queueExample.element();
        queueExample.peek();// element and peek do same action.if queue doesnt include first member, peek() doesn't throw exception
    }
}
