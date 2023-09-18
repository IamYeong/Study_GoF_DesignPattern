package com.gmail.wjdrhkddud2.bridge;

public class Chair extends Furniture {

    public Chair(Material material) {
        super(material);
    }

    @Override
    public void use() {
        System.out.println("Use chair");
    }
}
