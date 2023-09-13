package com.gmail.wjdrhkddud2.observer;

public class CommonSubscriber implements Subscriber {

    private int id;

    public CommonSubscriber(int id) {
        this.id = id;
    }

    @Override
    public void update() {
        System.out.println(id + " Received");
    }

    @Override
    public int getId() {
        return id;
    }
}
