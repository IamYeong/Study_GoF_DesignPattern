package com.gmail.wjdrhkddud2;

import com.gmail.wjdrhkddud2.builder.User;
import com.gmail.wjdrhkddud2.factorymethod.CreateType;
import com.gmail.wjdrhkddud2.factorymethod.Factory;
import com.gmail.wjdrhkddud2.factorymethod.ObjectA;
import com.gmail.wjdrhkddud2.factorymethod.ObjectInterface;
import com.gmail.wjdrhkddud2.prototype.Paper;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Main {

    public static void main(String... args) {
        Factory factory = new Factory();
        ObjectInterface object = factory.create(CreateType.A);

        User user = new User.Builder()
                .id("ID")
                .name("name")
                .password("password")
                .build();

        Paper paper = new Paper();

        for (int i = 0; i < 10; i++) {
            Paper temp = (Paper) paper.clone();
            System.out.println(temp.hashCode());
        }



    }

}
