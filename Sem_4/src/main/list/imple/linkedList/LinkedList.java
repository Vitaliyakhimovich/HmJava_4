package main.list.imple.linkedList;

import java.util.AbstractList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T elements) {
        Node<T> newNode = new Node<>(elements, null, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(T elements) {
        Node<T> newNode = new Node<>(elements, head, null);
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void addLast(T elements) {
        Node<T> newNode = new Node<>(elements, null, tail);
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }
    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else if (index == size - 1) {
            tail = tail.previous;
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }
    public T get(int index) {
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.elements;
    }
    public int size() {
        return size;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        Node<T> temp = head;
        for (int i = 1; i <= size; i++) {
            builder.append(temp.elements).append(", ");
            temp = temp.next;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
