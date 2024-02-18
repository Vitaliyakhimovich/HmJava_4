package main.list.until;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] elements;
    private int index;

    public ArrayIterator(E[] elements) {
        this.elements = elements;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < elements.length;
    }

    @Override
    public E next() {
        return elements[index++];
    }
}
