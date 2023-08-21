package com.gmail.wjdrhkddud2.decorator;

public abstract class DesktopModule implements Desktop {

    private Desktop desktop;

    public DesktopModule(Desktop desktop) {
        this.desktop = desktop;
    }

    @Override
    public void start() {
        this.desktop.start();
    }
}
