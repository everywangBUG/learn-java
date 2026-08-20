package com.wrapperClass_;

public class WrapperClassExample {
    public static void main(String[] args) {
        var n = 100;
        var n1 = new Integer(99);
        System.out.println(n1);
        System.out.println(n1.intValue());
        System.out.println("====================");
        //不推荐使用new Integer，推荐使用Integer.valueOf，'Integer(int)' 自版本 9 起已弃用并标记为移除
//        System.out.println(new java.lang.Integer(88));
        System.out.println(java.lang.Integer.valueOf(88));
        System.out.println(java.lang.Integer.valueOf("88"));
        System.out.println("====================");
        // 自动转型，int 100;自动转型为Integer，由Integer变为int的赋值写法，称为自动拆箱(Auto UnBoxing)
        java.lang.Integer n2 = 100;
        // 编译器直接使用Integer.value(n2)，由int变为Integer的赋值写法，称为自动装箱(Auto Boxing)，只发生在编译阶段
        // 两个引用类型Integer不能直接使用==比较，必须使用equals()比较
        int x = n2;
    }
}

// 把一个int类型转换成引用类型
class Integer {
    private int value;

    public Integer(int value) {
        this.value = value;
    }

    public int intValue() {
        return this.value;
    }
}
