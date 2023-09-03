package com.gmail.wjdrhkddud2.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class FactoryBuilder {

    private Map<Material, AbstractFactory> factoryMap;

    public FactoryBuilder() {
        factoryMap = new HashMap<>();
        setUp();
    }

    public AbstractFactory getFactory(Material material) {
        return factoryMap.get(material);
    }

    private void setUp() {
        factoryMap.put(Material.Leather, new LeatherFactory());
        factoryMap.put(Material.Paper, new PaperFactory());
    }

}
