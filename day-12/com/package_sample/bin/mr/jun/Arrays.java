package com.package_sample.bin.mr.jun;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Arrays");
    }

    private static  int[][] arr = new int[10][10];

    private String name;

    public Arrays(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("Hello " + this.name);
    }
}
