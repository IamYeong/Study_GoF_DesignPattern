package com.gmail.wjdrhkddud2.responsibilitychain;

public class DefaultFilter implements Filter {

    private FilterMediator mediator;

    public DefaultFilter(FilterMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void doFilter(Account account) {
        mediator.next();
    }
}
