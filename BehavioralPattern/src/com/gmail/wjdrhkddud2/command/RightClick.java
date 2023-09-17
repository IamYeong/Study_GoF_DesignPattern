package com.gmail.wjdrhkddud2.command;

public class RightClick implements Command {
    private Receiver monitorA;

    public RightClick(Receiver receiver) {
        this.monitorA = receiver;
    }

    @Override
    public void click() {
        System.out.println("Right click");
        monitorA.event(this);
    }
}
