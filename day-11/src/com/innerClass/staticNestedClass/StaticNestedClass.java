package com.innerClass.staticNestedClass;

public class StaticNestedClass {
    //使用静态内部类
    public static void main(String[] args) {
        Outer.StaticNested s = new Outer.StaticNested();
        s.hello();
    }
}

class Outer {
    private static String NAME = "OUTER";
    private String name;

    Outer(String name) {
        this.name = name;
    }

    static class StaticNested {
        void hello() {
            System.out.println("Hello " + Outer.NAME);
        }
    }
}
