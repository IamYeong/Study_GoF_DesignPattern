package com.gmail.wjdrhkddud2.templatemethod;

public abstract class Algorithm {

    public void execute() {
        firstStep();
        secondStep();
        System.out.println("execute");
    }

    public abstract void firstStep();

    public abstract void secondStep();

}
