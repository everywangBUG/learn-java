package com.package_sample.bin.ming;

public class Person1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("李四");
        person1.helloPerson();
    }

    private static String NAME = "Person";
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    void helloPerson() {
        System.out.println("Hello " + Person1.NAME);
    }
}
