package com.ploy_.exercise03;

public class Manager extends Employee {
    public Manager(String name, double todaySalary, int workDay, double grade) {
        super(name, todaySalary, workDay, grade);
    }

    @Override
    public void printSalary() {
        System.out.println(getName() + "经理的月薪：" + getTodaySalary() * getWorkDay() * getGrade());
    }
}
