package com.gmail.wjdrhkddud2.facade;

public class FacadeObject {

    private final ExampleInterface1 exampleInterface1;
    private final ExampleInterface2 exampleInterface2;
    private final ExampleObject1 exampleObject1;

    public FacadeObject() {
        exampleInterface1 = new Example1Impl();
        exampleInterface2 = new Example2Impl();
        exampleObject1 = new ExampleObject1();
    }

    public void execute1() {
        exampleInterface1.execute();
    }

    public void execute2() {
        exampleInterface2.execute();
    }

    public void execute3() {
        exampleObject1.execute();
    }

}
