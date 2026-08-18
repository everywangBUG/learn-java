package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethod_ {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class stdClass = Stu.class;
        //获取public方法getScore，参数为String
        System.out.println("获取getScore函数方法: " + stdClass.getMethod("getScore", String.class));
        //获取继承的public方法getName，无参数
        System.out.println("获取getName函数方法: " + stdClass.getMethod("getName"));
        //获取private方法getGrade，参数int
        System.out.println("获取getGrade: " + stdClass.getDeclaredMethod("getGrade", int.class));
        //调用方法
        Stu stu = new Stu();
        Method invokeScore = stdClass.getMethod("getScore", String.class);
        Object i = invokeScore.invoke(stu,"cell");
        System.out.println("使用getMethod方法调用getScore方法的结果: " + i);
        Method invokeName = stdClass.getMethod("getName");
        String name = (String)invokeName.invoke(stu);
        System.out.println("调用getName方法的结果: " + name);
        System.out.println("====================");
        Method invokeField = stdClass.getDeclaredMethod("getField", int.class);
        String field = (String)invokeField.invoke(null, 12345);
        System.out.println("调用静态方法getField方法的结果: " + field);
    }
}

class People {
    public String getName() {
        return "Person11";
    }
}

class Stu extends People {
    public int getScore(String type) {
        System.out.println("type: " + type);
        return 88;
    }

    private int getGrade(int year) {
        return year;
    }

    static String getField(int field) {
        System.out.println(88888888);
        return "getField888";
    }
}
