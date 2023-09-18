package com.gmail.wjdrhkddud2.abstractfactory;

public class LeatherFactory implements AbstractFactory {

    @Override
    public Wallet createWallet() {
        return new LeatherWallet();
    }

    @Override
    public Chair createChair() {
        return new LeatherChair();
    }

}
