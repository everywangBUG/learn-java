package com.interface_.exercise01;

interface InterfaceExercise01 {
    int x = 0; //等价于 public static final int x = 0;
}

class B {
    int x = 1; //普通属性
}

class C extends B implements InterfaceExercise01 {
    public void pX() {
//        System.out.println(x); // 错误，需要导入InterfaceExercise01.x
        B b = new B();
        System.out.println(b.x); //或者改成new B()对象的实例的x
        System.out.println(InterfaceExercise01.x);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}

//有没有错误，有错误改好后输出
//输出
// 1
// 0
