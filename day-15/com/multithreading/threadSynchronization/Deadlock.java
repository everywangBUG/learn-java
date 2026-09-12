package com.multithreading.threadSynchronization;

public class Deadlock {
    public static void main(String[] args) {
        var c = new CountNumber();

        new Thread(() -> c.add(99)).start();
        new Thread(() -> c.dec(99)).start();
    }
}

class CountNumber {
    private int value;
    private int another;

    // 定义两个锁对象
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public void add(int m) {
        synchronized (lockA) { // 获得lockA的锁
            this.value += m;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) { // 获得lockB的锁
                this.another += m;
            } // 释放lockB的锁
        } // 释放lockB的锁
    }

    public void dec(int m) {
        synchronized (lockB) { // 获得lockB的锁
            this.value -= m;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockA) { // 获得lockA的锁
                this.another -= m;
            } // 释放lockA的锁
        } // 释放lockB的锁
    }
}
