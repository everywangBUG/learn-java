package com.innerClass.memberInnerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.test();
    }
}

class Outer01 {
    private int n1 = 100;
    public String name = "张三";

    //定义在外部类的成员位置上
    class Inner01 {
        public void say() {
            System.out.println("say~");
            System.out.println(n1);
        }
    }

    //方法中使用成员内部类
    public void test() {
        Inner01 inner = new Inner01();
        inner.say();
    }
}
