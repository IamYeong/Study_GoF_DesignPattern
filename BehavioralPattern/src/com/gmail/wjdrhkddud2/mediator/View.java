package com.gmail.wjdrhkddud2.mediator;

public class View {

    private Context context;

    public View(Context context) {
        this.context = context;
    }

    public void action() {
        this.context.event();
    }

}
