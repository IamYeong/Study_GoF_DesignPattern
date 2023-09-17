package com.gmail.wjdrhkddud2.command;

public class LeftClick implements Command {

    private Receiver monitorA;

    public LeftClick(Receiver receiver) {
        this.monitorA = receiver;
    }

    @Override
    public void click() {
        System.out.println("Left click");
        monitorA.event(this);
    }
}
