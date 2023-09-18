package com.gmail.wjdrhkddud2.iterator;

public interface Collection<E> {

    void add(E e);

    void remove(int index);

    E get(int index);

    Iterator<E> iterator();

}
