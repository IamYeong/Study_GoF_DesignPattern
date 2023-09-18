package com.gmail.wjdrhkddud2.bridge.abstractfactory;

import com.gmail.wjdrhkddud2.bridge.Chair;
import com.gmail.wjdrhkddud2.bridge.Leather;
import com.gmail.wjdrhkddud2.bridge.Material;
import com.gmail.wjdrhkddud2.bridge.Table;

public class LeatherFactory implements AbstractFactory {


    @Override
    public Chair createChair() {
        return new Chair(new Leather());
    }

    @Override
    public Table createTable() {
        return new Table(new Leather());
    }
}
