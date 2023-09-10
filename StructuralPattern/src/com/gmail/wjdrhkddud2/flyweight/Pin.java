package com.gmail.wjdrhkddud2.flyweight;

public class Pin {

    private double x;
    private double y;

    private PinModel pinModel;

    public Pin(double x, double y, PinModel pinModel) {
        this.x = x;
        this.y = y;
        this.pinModel = pinModel;
        Memory.size += 10;
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

}
