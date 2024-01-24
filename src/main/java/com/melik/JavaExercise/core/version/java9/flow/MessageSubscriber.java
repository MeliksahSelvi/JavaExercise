package com.melik.JavaExercise.core.version.java9.flow;

import java.util.concurrent.Flow;

/**
 * @Author mselvi
 * @Created 21.01.2024
 */

public class MessageSubscriber<T> implements Flow.Subscriber<T> {

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription=subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(T item) {
        System.out.println("Message Received: "+item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}
