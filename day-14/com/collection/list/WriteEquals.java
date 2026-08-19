package com.collection.list;
import java.util.List;
import java.util.Objects;

//给Person类增加equals方法，使得调用indexOf()方法返回正常：
public class WriteEquals {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Xiao", "Ming", 18),
                new Person("Xiao", "Hong", 25),
                new Person("Bob", "Smith", 20)
        );
        //如果没有重新覆写equals方法判断为false(注释掉)
        boolean existNotOverrideEquals = list.contains(new Person("Xiao", "Ming", 18));
        System.out.println(existNotOverrideEquals); //false
        //覆写了equals方法可以正常判断
        boolean exist = list.contains(new Person("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }
}

class Person {
    String firstName;
    String lastName;
    int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // 重新写equals方法
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person p) {
            return Objects.equals(this.firstName, ((Person) obj).firstName) && Objects.equals(this.lastName, ((Person) obj).lastName);
        }
        return false;
    }
}
