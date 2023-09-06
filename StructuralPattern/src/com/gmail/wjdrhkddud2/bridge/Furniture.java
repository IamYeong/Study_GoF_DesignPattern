package com.gmail.wjdrhkddud2.bridge;

public abstract class Furniture {

    private Material material;

    public Furniture(Material material) {
        this.material = material;
    }

    public abstract void use();
}
