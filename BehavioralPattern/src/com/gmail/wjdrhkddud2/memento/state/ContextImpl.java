package com.gmail.wjdrhkddud2.memento.state;

import com.gmail.wjdrhkddud2.memento.Memento;
import com.gmail.wjdrhkddud2.memento.state.State;

public class ContextImpl implements Context {

    private State state;

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getState() {
        return this.state;
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
    public void power() {
        this.state.power();
    }
}
