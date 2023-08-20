package com.gmail.wjdrhkddud2.strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {

    private Map<Strategies, Strategy> strategyMap;

    public StrategyFactory() {
        strategyMap = new HashMap<>();
    }

    public Strategy createStrategy(Strategies strategyType) {
        return strategyMap.get(strategyType);
    }

    private void createInstance() {
        strategyMap.put(Strategies.A, new StrategyA());
        strategyMap.put(Strategies.B, new StrategyB());
    }

}
