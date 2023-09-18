package com.gmail.wjdrhkddud2.singleton;

public class Object {
    private static Object instance;

    public static Object getInstance() {
        if (instance == null) {
            instance = new Object();
        }

        return instance;
    }
}
