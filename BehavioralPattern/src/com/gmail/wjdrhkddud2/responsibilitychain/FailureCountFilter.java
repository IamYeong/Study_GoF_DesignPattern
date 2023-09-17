package com.gmail.wjdrhkddud2.responsibilitychain;

public class FailureCountFilter extends DefaultFilter {

    public FailureCountFilter(FilterMediator mediator) {
        super(mediator);
    }

    @Override
    public void doFilter(Account account) {

        System.out.println("Check failure count.");

        super.doFilter(account);
    }
}
