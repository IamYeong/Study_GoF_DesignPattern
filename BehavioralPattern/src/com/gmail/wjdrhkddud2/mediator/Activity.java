package com.gmail.wjdrhkddud2.mediator;

public class Activity implements Context {

    private Component component;
    private Component component2;
    private Component component3;
    private Component component4;
    private Component component5;

    private int count = 0;

    public Activity() {
        component = new Component(this);
        component2 = new Component(this);
        component3 = new Component(this);
        component4 = new Component(this);
        component5 = new Component(this);

        component.action();
        component2.action();
        component3.action();
        component4.action();
        component5.action();
    }

    @Override
    public void event() {
        count++;
        System.out.println("Event " + count);
    }
}
