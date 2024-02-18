package main.list.imple;

import main.GbList;
import main.list.until.ArrayIterator;

import java.util.Iterator;

public class GbArrayList<T> implements GbList<T> {
    int size;
    int capacity;
    private T[] elements;

    @SuppressWarnings("unchecked")

    public GbArrayList() {
        size = 0;
        capacity = 2;
        try {
            elements = (T[]) new Object[capacity];

        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    private void addCapacity() {
        try {
            capacity *= 2;
            T[] temp = (T[]) new Object[capacity];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void add(T items) {
    if(size == capacity){
        addCapacity();
    }
    elements[size++] = items;
    }

    @Override
    public void remove(int  index) {
        capacity = capacity - 1;
        T[] temp = (T[]) new Object[capacity];
        System.arraycopy(elements, 0, temp, 0, index);
        int amountElementsAfterIndex = elements.length - index - 1;
        System.arraycopy(elements, index + 1, temp, index, amountElementsAfterIndex);
        elements = temp;
        size -- ;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(elements);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int index = 0;
        while (index < size) {
            builder.append(elements[index]).append(", ");
            index ++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
