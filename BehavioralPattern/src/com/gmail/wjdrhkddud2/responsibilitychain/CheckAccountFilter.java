package com.gmail.wjdrhkddud2.responsibilitychain;

public class CheckAccountFilter extends DefaultFilter {

    public CheckAccountFilter(FilterMediator mediator) {
        super(mediator);
    }

    @Override
    public void doFilter(Account account) {

        System.out.println("Check account.");

        super.doFilter(account);
    }
}
