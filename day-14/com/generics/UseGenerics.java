package com.generics;

import java.util.Arrays;

public class UseGenerics {
    public static void main(String[] args) {
        //String现了Comparable<T>接口可以直接对String数组进行排序
        System.out.println(Arrays.toString(DirectSortStringArray.sortArray()));
        //如果使用自定义的Person类无法实现自定义的排序
        Person[] ps = new Person[] {
                new Person("张三", 18),
                new Person("李四", 20),
                new Person("王五", 15)
        };
//        Arrays.sort(ps); //报错ClassCastException
//        System.out.println(Arrays.toString(ps));
        //通过Person实现Compare<T>接口正常实现排序功能
        NewPerson[] nps = new NewPerson[] {
                new NewPerson("Tom", 18),
                new NewPerson("Alice", 20),
                new NewPerson("Jack", 15)
        };
        Arrays.sort(nps);
        System.out.println(Arrays.toString(nps));
    }
}

class DirectSortStringArray {
    static String[] sortArray() {
        String[] sa = new String[] {"origin", "Apple",  "Pear"};
        Arrays.sort(sa);
        return sa;
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + this.age;
    }
}

class NewPerson implements Comparable<NewPerson> {
    String name;
    int age;

    public NewPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + this.age;
    }

    @Override
    public int compareTo(NewPerson o) {
        return this.name.compareTo(o.name);
    }
}