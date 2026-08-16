package com.reflect;

public class GetField_ {
    public static void main(String[] args) throws NoSuchFieldException {
        Class stdClass = Student.class;
        System.out.println("获取Student实例的Class:" + stdClass);
        System.out.println("获取继承的name字段:" + stdClass.getField("name"));
        System.out.println("获取score字段:" + stdClass.getField("score"));
        System.out.println("获取私有age字段:" + stdClass.getDeclaredField("age"));
    }
}

class Person {
    public String name = "张三";
}

class Student extends Person {
    private int age = 18;
    public int score = 0;
}
