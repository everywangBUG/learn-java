package com.multithreading.useWaitAndNotify;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    public static void main(String[] args) {
        new TaskQueue();
    }

    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s) {
        this.queue.add(s);
        this.notifyAll(); // 唤醒this锁等待的线程
    }

    public synchronized String getTask() throws InterruptedException {
        while(queue.isEmpty()) {
            this.wait();
        }

        return queue.remove();
    }
}


