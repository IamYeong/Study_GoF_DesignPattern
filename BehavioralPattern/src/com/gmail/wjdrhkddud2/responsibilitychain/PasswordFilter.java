package com.gmail.wjdrhkddud2.responsibilitychain;

public class PasswordFilter extends DefaultFilter {

    public PasswordFilter(FilterMediator mediator) {
        super(mediator);
    }

    @Override
    public void doFilter(Account account) {

        System.out.println("Check password of account.");

        super.doFilter(account);
    }
}
