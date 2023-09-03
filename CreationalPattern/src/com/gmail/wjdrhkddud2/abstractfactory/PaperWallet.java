package com.gmail.wjdrhkddud2.abstractfactory;

public class PaperWallet implements Wallet {

    @Override
    public void getMoney() {
        System.out.println("10,000원이 들어있어.");
    }
}
