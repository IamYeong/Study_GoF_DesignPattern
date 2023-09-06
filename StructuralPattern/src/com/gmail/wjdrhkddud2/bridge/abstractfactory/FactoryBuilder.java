package com.gmail.wjdrhkddud2.bridge.abstractfactory;

import com.gmail.wjdrhkddud2.bridge.Material;

import java.util.HashMap;
import java.util.Map;

public class FactoryBuilder {

    private Map<Materials, AbstractFactory> factoryMap;

    public FactoryBuilder() {
        factoryMap = new HashMap<>();
        setUp();
    }

    public AbstractFactory getFactory(Materials material) {
        return factoryMap.get(material);
    }

    private void setUp() {
        factoryMap.put(Materials.Leather, new LeatherFactory());
        factoryMap.put(Materials.Wood, new WoodFactory());
    }

}
