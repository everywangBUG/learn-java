package com.multithreading;

import java.time.LocalTime;

public class GuardThread {
    public static void main(String[] args) throws InterruptedException {
        InfinityThread it = new InfinityThread();
        // 创建守护线程，设置了后住线程结束了那么jvm直接退出，不设置必须等所有的线程结束，才会退出jvm
        it.setDaemon(true);
        it.start();

        Thread.sleep(1000); // 主线程休眠一段时间
        System.out.println("主线程结束");
    }
}

class InfinityThread extends Thread {
    @Override
    public void run() {
        // 无线循环的线程
        while(true) {
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
