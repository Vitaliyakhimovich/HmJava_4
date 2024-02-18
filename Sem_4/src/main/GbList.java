package main;

public interface GbList<T> extends Iterable<T> {
    void add(T items);
    void remove(int index);
    T get(int index);
    int size();
}
