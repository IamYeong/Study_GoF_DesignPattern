package com.gmail.wjdrhkddud2.memento.state;

import com.gmail.wjdrhkddud2.memento.state.State;

public class OffState implements State {

    private Context context;

    public OffState(Context context) {
        this.context = context;
    }

    @Override
    public void power() {
        System.out.println("Off state : Power ON");
        context.setState(new OnState(context));
    }
}
