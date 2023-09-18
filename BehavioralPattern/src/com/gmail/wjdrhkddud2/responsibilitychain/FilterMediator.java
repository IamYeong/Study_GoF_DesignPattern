package com.gmail.wjdrhkddud2.responsibilitychain;

import java.util.ArrayList;
import java.util.List;

public class FilterMediator {

    private List<Filter> filters;
    private int cursor;
    private Account account;

    public FilterMediator() {
        filters = new ArrayList<>();
        cursor = 0;
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void start(Account account) {
        this.account = account;
        if (filters.size() >= 1) {
            filters.get(0).doFilter(account);
        }
    }

    public void next() {
        ++cursor;
        if ((filters.size() - 1) < cursor) return;
        Filter filter = filters.get(cursor);
        filter.doFilter(this.account);
    }

}
