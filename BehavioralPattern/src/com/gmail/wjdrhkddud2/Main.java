package com.gmail.wjdrhkddud2;

import com.gmail.wjdrhkddud2.iterator.ArrayCollection;
import com.gmail.wjdrhkddud2.iterator.ArrayIterator;
import com.gmail.wjdrhkddud2.iterator.Iterator;
import com.gmail.wjdrhkddud2.mediator.Activity;
import com.gmail.wjdrhkddud2.mediator.Context;
import com.gmail.wjdrhkddud2.observer.CommonSubscriber;
import com.gmail.wjdrhkddud2.observer.NewsA;
import com.gmail.wjdrhkddud2.observer.NewsChannel;
import com.gmail.wjdrhkddud2.responsibilitychain.*;
import com.gmail.wjdrhkddud2.state.ContextImpl;
import com.gmail.wjdrhkddud2.state.OffState;
import com.gmail.wjdrhkddud2.strategy.Strategies;
import com.gmail.wjdrhkddud2.strategy.Strategy;
import com.gmail.wjdrhkddud2.strategy.StrategyFactory;
import com.gmail.wjdrhkddud2.templatemethod.factorymethod.AlgorithmFactory;
import com.gmail.wjdrhkddud2.templatemethod.factorymethod.AlgorithmType;
import com.gmail.wjdrhkddud2.visitor.Entity;
import com.gmail.wjdrhkddud2.visitor.EntityA;
import com.gmail.wjdrhkddud2.visitor.EntityB;
import com.gmail.wjdrhkddud2.visitor.VisitorImpl;

import java.util.ArrayList;
import java.util.List;

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

        Entity entityA = new EntityA();
        Entity entityB = new EntityB();
        System.out.println("Result A : " + entityA.getResult(new VisitorImpl()));
        System.out.println("Result B : " + entityB.getResult(new VisitorImpl()));

        //List<Integer> list = new ArrayList<>();
        //Iterator iterator = list.iterator();
        //Integer integer = (Integer) iterator.next();

        ArrayCollection<Integer> array = new ArrayCollection<>();

        for (int i = 0; i < 10; i++) {
            array.add(i);
        }

        Iterator arrayIterator = array.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println("Entity : " + arrayIterator.next());
        }

        array.remove(5);
        array.remove(8);

        Iterator arrayIterator2 = array.iterator();
        while (arrayIterator2.hasNext()) {
            System.out.println("Entity : " + arrayIterator2.next());
        }

        com.gmail.wjdrhkddud2.state.Context context = new ContextImpl();
        context.setState(new OffState(context));
        context.power();
        context.power();
        context.power();
        context.power();


        FilterMediator filterMediator = new FilterMediator();
        filterMediator.addFilter(new CheckAccountFilter(filterMediator));
        filterMediator.addFilter(new PasswordFilter(filterMediator));
        filterMediator.addFilter(new FailureCountFilter(filterMediator));

        filterMediator.start(new Account("abcde", "abcd1234!!"));

    }

}
