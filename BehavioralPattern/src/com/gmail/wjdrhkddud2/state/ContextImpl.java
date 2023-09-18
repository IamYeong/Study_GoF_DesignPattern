package com.gmail.wjdrhkddud2.state;

public class ContextImpl implements Context {

    private State state;

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void power() {
        this.state.power();
    }
}
