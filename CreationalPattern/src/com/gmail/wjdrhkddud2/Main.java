package com.gmail.wjdrhkddud2;

import com.gmail.wjdrhkddud2.factorymethod.CreateType;
import com.gmail.wjdrhkddud2.factorymethod.Factory;
import com.gmail.wjdrhkddud2.factorymethod.ObjectA;
import com.gmail.wjdrhkddud2.factorymethod.ObjectInterface;

public class Main {

    public static void main(String... args) {
        Factory factory = new Factory();
        ObjectInterface object = factory.create(CreateType.A);

    }

}
