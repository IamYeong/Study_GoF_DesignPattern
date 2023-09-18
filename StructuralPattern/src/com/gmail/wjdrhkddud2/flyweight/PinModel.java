package com.gmail.wjdrhkddud2.flyweight;

public class PinModel {

    private int color;
    private Shape shape;

    public PinModel(Shape shape, int color) {
        this.shape = shape;
        this.color = color;
        Memory.size += 90;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

}
