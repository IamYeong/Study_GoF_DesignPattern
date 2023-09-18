package com.gmail.wjdrhkddud2.flyweight;

public class Map {


    public Pin createPin(double x, double y, Shape shape) {
        return new Pin(x, y, PinFactory.getModel(shape));
    }

}
