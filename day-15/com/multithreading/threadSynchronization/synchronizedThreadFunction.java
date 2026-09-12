package com.multithreading.threadSynchronization;

public class synchronizedThreadFunction {
    public static void main(String[] args) {
        // synchronized锁住的是this，创建实例的时候，在新线程中互不影响
        // 这里的类可以被多线程安全访问，Counter是线程安全的
        // 线程安全的java标准库: StringBuffer String Integer LocalDate Math这些是线程安全的，其他大部分的类都是非线程安全的
        var c1 = new Counter();
        var c2 = new Counter();

        // 对c1进行操作的线程
        new Thread(() -> {
            c1.add(8);
        }).start();

        new Thread(() -> {
            c1.dec(1);
        }).start();

        // 对c2的操作的线程
        new Thread(() -> {
            c2.add(88);
        }).start();

        new Thread(() -> {
            c2.dec(66);
        }).start();
    }
}

class Counter {
    private int count = 0;

    public void add(int n) {
        synchronized (this) {
            count += n;
        }
    }

    // synchronized这里的写法和上面的锁this一致
    public synchronized void add(int n, int m) {
        count = n + m;
    }


    public void dec(int n) {
        synchronized (this) {
            count -= n;
        }
    }

    public synchronized void dec(int n, int m) {
        count = Math.abs(n - m);
    }

    public int get() {
        return count;
    }
}