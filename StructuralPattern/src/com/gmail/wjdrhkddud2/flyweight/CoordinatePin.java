package com.gmail.wjdrhkddud2.flyweight;

public class CoordinatePin {

    private double x;
    private double y;
    private int color;
    private Shape shape;

    public CoordinatePin(double x, double y, Shape shape) {
        this.x = x;
        this.y = y;
        this.color = 0;
        this.shape = shape;
        Memory.size += 100;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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
