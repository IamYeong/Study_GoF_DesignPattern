package com.gmail.wjdrhkddud2;

import com.gmail.wjdrhkddud2.strategy.Strategies;
import com.gmail.wjdrhkddud2.strategy.Strategy;
import com.gmail.wjdrhkddud2.strategy.StrategyFactory;

public class Main {

    public static void main(String... args) {
        StrategyFactory factory = new StrategyFactory();
        Strategy strategy = factory.createStrategy(Strategies.A);
    }

}
