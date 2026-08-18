package com.generics;

public class WriteGenerics {
}

class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public T getLast() {
        return last;
    }

    // 对静态方法使用<T>，Pair前面的<T>和Pair传入的T没有任何关系，正确的写法是使用另一种泛型类型
    public static <T> Pair<T> create(T first, T last) {
        return new Pair<T>(first, last);
    }

    //使用K把T类型和K类型分开来
    public static <K> Pair<K> newCreate(K first, K last) {
        return new Pair<K>(first, last);
    }
}