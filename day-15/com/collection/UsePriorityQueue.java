package com.collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UsePriorityQueue {
    public static void main(String[] args) {
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        q.offer(new User("Jack", "A10"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空
    }
}

class UserComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两个人的号都是A或者V开头，比较号的大小
//            return u1.number.compareTo(u2.number)
            return Integer.parseInt(u1.number.substring(1)) - Integer.parseInt(u2.number.substring(1));
        }
        if (u1.number.charAt(0) == 'V') {
            //如果以V开头，优先级高
            return -1;
        } else {
            return 1;
        }
    }
}

class User {
    public String name = "";
    public String number = "";


    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "/" + number;
    }
}
