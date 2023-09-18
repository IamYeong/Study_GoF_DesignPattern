package com.gmail.wjdrhkddud2.interpreter;

import java.util.Map;

public class NonTerminalExpression implements Expression {

    @Override
    public int interpret(char a, char b) {

        return (a - 0x30) + (b - 0x30);

    }
}
