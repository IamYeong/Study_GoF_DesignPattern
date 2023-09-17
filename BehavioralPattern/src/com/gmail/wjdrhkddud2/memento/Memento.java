package com.gmail.wjdrhkddud2.memento;

import com.gmail.wjdrhkddud2.memento.state.Context;
import com.gmail.wjdrhkddud2.memento.state.State;

public class Memento implements Context {

    private State state;

    public Memento(State state) {
        this.state = state;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public Memento createMemento() {
        return new Memento(state);
    }

    @Override
    public void restore(Memento memento) {
        this.state = memento.getState();
    }

    @Override
    public State getState() {
        return this.state;
    }

    @Override
    public void power() {

    }
}
