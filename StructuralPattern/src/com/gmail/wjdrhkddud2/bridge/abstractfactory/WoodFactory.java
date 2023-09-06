package com.gmail.wjdrhkddud2.bridge.abstractfactory;

import com.gmail.wjdrhkddud2.bridge.Chair;
import com.gmail.wjdrhkddud2.bridge.Material;
import com.gmail.wjdrhkddud2.bridge.Table;
import com.gmail.wjdrhkddud2.bridge.Wood;

public class WoodFactory implements AbstractFactory {

    @Override
    public Chair createChair() {
        return new Chair(new Wood());
    }

    @Override
    public Table createTable() {
        return new Table(new Wood());
    }
}
