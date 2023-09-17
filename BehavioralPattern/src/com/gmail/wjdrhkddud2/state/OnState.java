package com.gmail.wjdrhkddud2.state;

public class OnState implements State {

    private Context context;

    public OnState(Context context) {
        this.context = context;
    }


    @Override
    public void power() {
        System.out.println("On state : OFF power");
        context.setState(new OffState(context));
    }
}
