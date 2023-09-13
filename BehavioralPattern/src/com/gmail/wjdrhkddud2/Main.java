package com.gmail.wjdrhkddud2;

import com.gmail.wjdrhkddud2.mediator.Context;
import com.gmail.wjdrhkddud2.mediator.Activity;
import com.gmail.wjdrhkddud2.observer.CommonSubscriber;
import com.gmail.wjdrhkddud2.observer.NewsA;
import com.gmail.wjdrhkddud2.observer.NewsChannel;
import com.gmail.wjdrhkddud2.strategy.Strategies;
import com.gmail.wjdrhkddud2.strategy.Strategy;
import com.gmail.wjdrhkddud2.strategy.StrategyFactory;
import com.gmail.wjdrhkddud2.templatemethod.factorymethod.AlgorithmFactory;
import com.gmail.wjdrhkddud2.templatemethod.factorymethod.AlgorithmType;

public class Main {

    public static void main(String... args) {
        StrategyFactory factory = new StrategyFactory();
        Strategy strategy = factory.createStrategy(Strategies.A);

        Context mediator = new Activity();
        mediator.event();

        AlgorithmFactory algorithmFactory = new AlgorithmFactory();
        algorithmFactory.create(AlgorithmType.A).execute();
        algorithmFactory.create(AlgorithmType.B).execute();

        NewsChannel newsChannel = new NewsA();
        for (int i = 0; i < 10; i++) newsChannel.subscribe(new CommonSubscriber(i));
        newsChannel.unsubscribe(5);
        newsChannel.unsubscribe(8);
        newsChannel.notification();

    }

}
