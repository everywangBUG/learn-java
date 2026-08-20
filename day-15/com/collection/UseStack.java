package com.collection;

import java.util.Deque;
import java.util.LinkedList;

public class UseStack {
    public static void main(String[] args) {
        String hex = toHex(12500);
        System.out.println(hex + "hex");
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }

    static String toHex(int n) {
        String r = "";
        Deque<Object> dq = new LinkedList<>();
        while (true) {
            int temp = n % 16;

            dq.addFirst(HEX.getName(temp));
            n /= 16;

            if (n == 0) {
                break;
            }
        }

        while(!dq.isEmpty()) {
            r += dq.removeFirst();
        }

        return r;
    }
}

enum HEX {
    A(10), B(11), C(12), D(13), E(14), F(15);
    private int i;

    HEX(int i) {
        this.i = i;
    }

    public static String getName(int i) {
        for (HEX h : HEX.values()) {
            if (h.i == i) {
                return h.name();
            }
        }
        return String.valueOf(i);
    }
}
