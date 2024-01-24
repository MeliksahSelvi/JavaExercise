package com.melik.JavaExercise.core.version.java9.flow;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class FlowExample {

    public static void main(String[] args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        MessageSubscriber<String> subscriber = new MessageSubscriber<>();
        publisher.subscribe(subscriber);

        List<String> stringList = List.of("ali", "veli", "mehmet");
        stringList.forEach(s -> {
            publisher.submit(s);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        publisher.close();
    }
}
