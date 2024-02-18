package main.list.imple.linkedList;

public class Node<T> {
    T elements;
    Node<T> next;
    Node<T> previous;

    public Node(T elements, Node<T> next, Node<T> previous) {
        this.elements = elements;
        this.next = next;
        this.previous = previous;
    }
}
