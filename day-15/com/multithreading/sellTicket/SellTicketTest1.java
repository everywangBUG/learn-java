package com.multithreading.sellTicket;

// 模拟三个售票窗口，分别使用继承Thread和Runnable方式，并分析问题
public class SellTicketTest1 {
    public static void main(String[] args) {
        SellTicketTestByInterface T1 = new SellTicketTestByInterface();
        new Thread(T1).start();
        new Thread(T1).start();
        new Thread(T1).start();
    }
}

class SellTicketTestByInterface implements Runnable {
    public int tickets = 100;

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
