package com.multithreading;

/*
    线程有几种状态
    1. New：创建新的线程，尚未执行
    2. Runnable：运行中的线程，真正执行run()方法的java代码
    3. Blocked：运行中的线程，因为某些操作被阻塞而被挂起
    4. Waiting：运行中的线程，因为某些操作在等待中
    5. Timed Waiting：运行中的线程，因为执行sleep()方法计时等待
    6. Terminated：线程终止，因为run()方法执行完毕
 */
public class ThreadStatus {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start(); // 启动t线程
        t.join(); // main线程会等待t线程结束
        System.out.println("end");

        System.out.println("==========中断线程的第一种方式：根据isInterrupted判断=========");
        InterruptedThread.interruptedThread();
    }
}

class InterruptedThread {
    public static void interruptedThread() throws InterruptedException {
        Thread t = new MyThread1();
        t.start(); // 开启线程
        Thread.sleep(1); // 暂停1毫秒
        t.interrupt(); // 向t线程发出中断请求，传到isInterrupted()根据代码判断t线程是否能够响应
        t.join(); // 等待t线程结束
        System.out.println("第一种线程结束方法end");

        System.out.println("==========中断线程的第二种方式：如果main线程调用了interrupted()，join()方法会抛出Interrupted()，只要捕获到join()方法抛出的InterruptedException就调用interrupted()=========");
        Thread t2 = new MyThread2();
        t2.start();
        Thread.sleep(100);
        t2.interrupt();
        t2.join(); // 等待线程t2结束
        System.out.println("第二种线程结束方法end");
    }
}

class MyThread1 extends Thread {
    public void run() {
        int n = 0;
        // t.interrrupt 一毫秒后结束线程
        while (!isInterrupted()) {
            n++;
            System.out.println(n + "hello");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        Thread hello = new HelloThread();
        hello.start(); // 启动线程
        try {
            hello.join(); // 等待hello进程结束
        } catch (InterruptedException e) {
            System.out.println("interrupted");
            throw new RuntimeException(e);
        }
        hello.interrupt();
    }
}

class HelloThread extends Thread {
    public void run() {
        int n = 0;
        while(!isInterrupted()) {
            n++;
            System.out.println(n + " hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
