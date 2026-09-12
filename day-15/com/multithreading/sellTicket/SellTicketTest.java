package com.multithreading.sellTicket;

// 模拟三个售票窗口，分别使用继承Thread和Runnable方式，并分析问题
public class SellTicketTest {
    public static void main(String[] args) {
        SellTicketByThread T1 = new SellTicketByThread();
        T1.start();

        SellTicketByThread T2 = new SellTicketByThread();
        T2.start();

        SellTicketByThread T3 = new SellTicketByThread();
        T3.start();
    }
}

// 继承Thread方式
class SellTicketByThread extends Thread {
    int tickets = 100; // 余票

    @Override
    public void run() {
        while(true) {
            if (tickets <= 0) {
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖了一张票，剩余票数" + (--tickets));
        }
    }
}
