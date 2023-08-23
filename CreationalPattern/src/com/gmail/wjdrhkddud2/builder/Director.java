package com.gmail.wjdrhkddud2.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Director constructA() {
        return new BuilderA()
                .a("a")
                .b("b")
                .c("c")
                .getDirector();
    }

    public Director constructB() {
        return new BuilderA()
                .a("a")
                .getDirector();

    }
}
