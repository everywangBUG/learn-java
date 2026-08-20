package com.multithreading;

// 设置running标志位中断HelloThread1的线程
public class InterruptedThread2 {
    public static void main(String[] args) throws InterruptedException {
        HelloThread1 t = new HelloThread1();
        t.start();
        Thread.sleep(1);
        t.running = false;
    }
}

class HelloThread1 extends Thread {
    // volatile表示线程共享的变量，确保每个线程都能读取到更新后的值
    public volatile boolean running = true;

    public void run() {
        int n = 0;
        while(running) {
            n++;
            System.out.println(n + " hello");
        }
        System.out.println("end");
    }
}
