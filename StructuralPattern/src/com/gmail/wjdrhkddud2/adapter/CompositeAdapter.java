package com.gmail.wjdrhkddud2.adapter;

public class CompositeAdapter implements ApplePort {

    private CommonPort commonPort;

    public CompositeAdapter(CommonPort commonPort) {
        this.commonPort = commonPort;
    }

    @Override
    public void connect() {
        commonPort.connect();
    }
}
