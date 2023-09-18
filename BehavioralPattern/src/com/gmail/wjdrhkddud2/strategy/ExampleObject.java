package com.gmail.wjdrhkddud2.strategy;

public class ExampleObject {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.execute();
    }

}
