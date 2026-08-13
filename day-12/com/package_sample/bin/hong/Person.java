package com.package_sample.bin.hong;

public class Person {
    public static void main(String[] args) {
        Person person = new Person("张三");
        person.helloPerson();
    }
    
    private static String NAME = "Person";
    private String name;

    public Person(String name) {
        this.name = name;
    }

    void helloPerson() {
        System.out.println("Hello " + Person.NAME);
    }
}
