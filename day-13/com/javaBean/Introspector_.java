package com.javaBean;

import java.beans.*;

public class Introspector_ {
    public static void main(String[] args) throws IntrospectionException {
        // 使用Introspector获取所有的读写属性
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd: info.getPropertyDescriptors()) {
            System.out.println(pd.getName() + " getName()");
            System.out.println(" " + pd.getReadMethod() + " getReadMethod()");
            System.out.println(" " + pd.getWriteMethod() + " getWriteMethod");
        }
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
