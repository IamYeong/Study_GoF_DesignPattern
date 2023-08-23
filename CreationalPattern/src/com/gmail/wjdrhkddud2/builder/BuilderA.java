package com.gmail.wjdrhkddud2.builder;

public class BuilderA implements Builder {

    private String a = "a";
    private String b = "b";
    private String c = "c";


    @Override
    public Builder a(String a) {
        this.a = a;
        return this;
    }

    @Override
    public Builder b(String b) {
        this.b = b;
        return this;
    }

    @Override
    public Builder c(String c) {
        this.c = c;
        return this;
    }

    @Override
    public Director getDirector() {
        return new Director(this);
    }
}
