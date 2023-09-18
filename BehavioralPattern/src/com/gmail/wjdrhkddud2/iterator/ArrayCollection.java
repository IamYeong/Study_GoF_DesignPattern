package com.gmail.wjdrhkddud2.iterator;

public class ArrayCollection<E> implements Collection<E> {

    private Object[] array;

    public ArrayCollection() {
        array = new Object[0];
    }

    @Override
    public void add(E e) {
        int size = array.length;
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = new Object[size + 1];

        for (int i = 0; i < size; i++) {
            array[i] = temp[i];
        }

        array[size] = e;

    }

    @Override
    public void remove(int index) {
        int size = array.length;
        Object[] temp = new Object[size];

        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }

        array = new Object[size - 1];

        for (int i = 0; i < index; i++) {
            array[i] = temp[i];
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = temp[i + 1];
        }

    }

    @Override
    public E get(int index) {
        return (E)array[index];
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(array);
    }
}
