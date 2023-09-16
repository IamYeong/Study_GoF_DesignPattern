package com.gmail.wjdrhkddud2.visitor;

public class EntityB implements Entity {

    private int property = 200;

    @Override
    public int getResult(Visitor visitor) {
        return visitor.algorithm(this);
    }

    @Override
    public int getProperty() {
        return property;
    }
}
