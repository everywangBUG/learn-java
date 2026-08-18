package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetField_ {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class stdClass = Student.class;
        System.out.println("获取Student实例的Class:" + stdClass);
        System.out.println("获取继承的name字段:" + stdClass.getField("name"));
        System.out.println("获取score字段:" + stdClass.getField("score"));
        System.out.println("获取私有age字段:" + stdClass.getDeclaredField("age"));
        System.out.println("获取类的修饰符:" + Modifier.toString(stdClass.getModifiers()));
        System.out.println("获取私有字段age的修饰符:" + Modifier.toString(stdClass.getDeclaredField("age").getModifiers()));
        System.out.println("查看name是否是公有字段:" + Modifier.isPublic(stdClass.getField("name").getModifiers()));
        System.out.println("====================");
        Object p = new Person("李四");
        Class pc = p.getClass(); //获取Person的class
        Field f = pc.getField("name");
        Object value = f.get(p);
        System.out.println("获取字段name的值:" + value); //李四
        System.out.println("===================");
        f.setAccessible(true);
        f.set(p, "Xiao Hong");
        System.out.println("设置成功后的name值:" + f.get(p));
    }
}

class Person {
    public String name = "张三";

    public Person(String name) {
        this.name = name;
    }
}

final class Student extends Person {
    private int age = 18;
    public int score = 0;

    public Student(String name, int age, int score) {
        super(name);
        this.age = age;
        this.score = score;
    }
}
