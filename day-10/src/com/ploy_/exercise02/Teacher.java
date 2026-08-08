package com.ploy_.exercise02;

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }

    public void introduce() {
        System.out.println("姓名：" + name + " 年龄：" + age + " 职称：" + post + " 薪水：" + salary);
    }
}
