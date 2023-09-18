package com.gmail.wjdrhkddud2.abstractfactory;

public class PaperFactory implements AbstractFactory {

    @Override
    public Wallet createWallet() {
        return new PaperWallet();
    }

    @Override
    public Chair createChair() {
        return new PaperChair();
    }
}
