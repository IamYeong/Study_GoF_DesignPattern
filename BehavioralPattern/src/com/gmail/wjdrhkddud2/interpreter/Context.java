package com.gmail.wjdrhkddud2.interpreter;

import java.util.Stack;

public class Context {

    private Stack<Character> characters;

    public Context() {
        this.characters = new Stack<>();
    }

    public int run(String word) {
        for (int i = 0; i < word.length(); i++) {
            characters.push(word.charAt(i));
        }

        int result = 0;

        while (!characters.isEmpty()) {

            char c = characters.pop();
            if (c == '+') {

                NonTerminalExpression term = new NonTerminalExpression();
                result += term.interpret(characters.pop(), characters.pop());
            }


        }

        return result;
    }

}
