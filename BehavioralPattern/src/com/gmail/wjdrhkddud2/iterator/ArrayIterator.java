package com.gmail.wjdrhkddud2.iterator;

public class ArrayIterator<E> implements Iterator<E> {

    private Object[] arr;
    private int cursor;

    public ArrayIterator(Object[] array) {
        this.arr = array;
        cursor = 0;
    }

    @Override
    public E next() {

        return (E)arr[cursor++];
    }

    @Override
    public boolean hasNext() {
        if (arr == null) return false;
        else {
            return (arr.length - 1) >= cursor;
        }
    }
}
