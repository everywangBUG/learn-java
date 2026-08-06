package com.extends_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    A() {
        System.out.println("a"); //第一步输出a
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A{
    B() {
        //调用B有参构造器
        this("abc");
        System.out.println("b"); //第三步输出b
    }

    B(String name) {
        //省略了super()，调用类A的无参构造器
        //super();
        System.out.println("b name"); //第二步输出b name
    }
}

// 结果
// a
// b name
// b
