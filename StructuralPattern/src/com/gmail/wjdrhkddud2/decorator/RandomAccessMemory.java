package com.gmail.wjdrhkddud2.decorator;

public class RandomAccessMemory extends DesktopModule {

    public RandomAccessMemory(Desktop desktop) {
        super(desktop);
    }

    @Override
    public void start() {
        super.start();
        access();
    }

    public void access() {

    }
}
