package com.gmail.wjdrhkddud2.visitor;

import java.lang.reflect.GenericArrayType;

public class VisitorImpl implements Visitor {

    @Override
    public int algorithm(Entity entity) {

        return (entity.getProperty() * 2) + 1;

    }
}
