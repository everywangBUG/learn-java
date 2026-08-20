package com.multithreading;

public class UseThread {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start(); //开启新线程
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        Java8Lambda.createThread();
    }
}

// 方法一，定义一个派生类
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("start new thread");
    }
}

// 方法二，创建一个Thread实例时传入一个Runnable实例
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start new thread again");
    }
}

// 方法三，使用java8的lambda语法
class Java8Lambda {
    static void createThread() {
        Thread t = new Thread(() -> {
            System.out.println("start new thread again again");
        });
        t.start();
    }
}
