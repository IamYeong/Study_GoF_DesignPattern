package com.gmail.wjdrhkddud2.decorator;

public class GraphicCard extends DesktopModule {

    public GraphicCard(Desktop desktop) {
        super(desktop);
    }

    @Override
    public void start() {
        super.start();
        rendering();
    }

    public void rendering() {

    }
}
