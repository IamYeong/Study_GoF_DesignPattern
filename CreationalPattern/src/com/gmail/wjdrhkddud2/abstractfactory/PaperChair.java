package com.gmail.wjdrhkddud2.abstractfactory;

public class PaperChair implements Chair {

    @Override
    public void seat() {
        System.out.println("저렴한 대신 불안정한 의자야.");
    }
}
