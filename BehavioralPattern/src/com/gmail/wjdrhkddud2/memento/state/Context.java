package com.gmail.wjdrhkddud2.memento.state;

import com.gmail.wjdrhkddud2.memento.Memento;
import com.gmail.wjdrhkddud2.memento.state.State;

public interface Context {

    void setState(State state);

    State getState();

    Memento createMemento();

    void restore(Memento memento);

    void power();

}
