package com.ploy_.exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("tom", 30, "前端开发");
        people[1] = new Person("jack", 27, "java应用开发");
        people[2] = new Person("jack", 29, "大数据开发");
        System.out.println(people[0].toString());
        Person temp = null;
        for (int i = people.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1 ; j++) {
                if (people[j].getAge() > people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

        System.out.println("输出排序后的people对象");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
        }
    }
}

