package com.extends_.exercise;

class ExtendsExercise02 {
    public static void main(String[] args) {
        E e = new E();
    }
}

class C {
    public C() {
        System.out.println("我是C类"); //第一次输出
    }
}

class D extends C {
    public D() {
        System.out.println("我是D类的无参构造");
    }

    public D(String name) {
        // 省略了super(); 调用默认的父类的无参构造器
        System.out.println("我是D类的有参构造" + name); //第二次输出 hahaha
    }
}

class E extends D {
    public E() {
        this("hello");
        System.out.println("我是E类的无参构造"); // 第四次输出
    }

    public E(String name) {
        super("hahaha");
        System.out.println("我是E类的有参构造器" + name); //第三次输出 hello
    }
}

// 我是C类
// 我是D类的有参构造hahaha
// 我是E类的有参构造器hello
// 我是E类的无参构造
