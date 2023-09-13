package com.gmail.wjdrhkddud2.observer;

import java.util.HashMap;
import java.util.Map;

public class NewsA implements NewsChannel {

    private Map<Integer, Subscriber> subscribers;

    public NewsA() {
        this.subscribers = new HashMap<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.put(subscriber.getId(), subscriber);
        System.out.println(subscriber.getId() + " Subscribe!");
    }

    @Override
    public void unsubscribe(int id) {
        subscribers.remove(id);
        System.out.println(id + " Unsubscribe...");
    }

    @Override
    public void notification() {
        subscribers.forEach((key, value) -> {
            value.update();
        });
    }
}
