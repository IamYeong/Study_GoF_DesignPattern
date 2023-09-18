package com.gmail.wjdrhkddud2.bridge;

public class Table extends Furniture {

    public Table(Material material) {
        super(material);
    }

    @Override
    public void use() {
        System.out.println("Use table");
    }
}
