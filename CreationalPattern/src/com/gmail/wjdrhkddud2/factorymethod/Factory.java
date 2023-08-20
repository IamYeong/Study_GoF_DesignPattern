package com.gmail.wjdrhkddud2.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private Map<CreateType, ObjectInterface> objectMap;

    public Factory() {
        objectMap = new HashMap<>();
        createInstance();
    }

    public ObjectInterface create(CreateType type) {
        return objectMap.get(type);
    }

    private void createInstance() {
        objectMap.put(CreateType.A, new ObjectA());
        objectMap.put(CreateType.B, new ObjectB());
    }

}
