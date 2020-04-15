package com.leeyy.test01;

public class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last){
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    public static <K> Pair<K> create(K first, K laset){
        return new Pair<K>(first, laset);
    }
}
