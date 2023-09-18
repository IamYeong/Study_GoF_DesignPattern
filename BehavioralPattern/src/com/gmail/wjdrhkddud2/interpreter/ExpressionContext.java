package com.gmail.wjdrhkddud2.interpreter;

import java.util.Map;

public class ExpressionContext {
    private Map<String, Boolean> context;

    public void assign(String work) {
        context.put(work, false);
    }
}
