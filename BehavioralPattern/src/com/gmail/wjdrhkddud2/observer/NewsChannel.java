package com.gmail.wjdrhkddud2.observer;

public interface NewsChannel {
    void subscribe(Subscriber subscriber);
    void unsubscribe(int id);
    void notification();
}
