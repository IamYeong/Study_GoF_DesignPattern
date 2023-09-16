package com.gmail.wjdrhkddud2.visitor;

public class EntityA implements Entity {

    private int property = 100;

    @Override
    public int getResult(Visitor visitor) {
        return visitor.algorithm(this);
    }

    @Override
    public int getProperty() {
        return property;
    }
}
