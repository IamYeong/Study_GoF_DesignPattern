package com.gmail.wjdrhkddud2.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PinFactory {

    private static Map<Shape, PinModel> cache = new HashMap<>();

    public static PinModel getModel(Shape shape) {
        if (!cache.containsKey(shape)) {
            PinModel model = new PinModel(shape, 0);
            cache.put(shape, model);
        }

        return cache.get(shape);
    }

}
