package com.ploy_.exercise03;

public class OrdinaryEmployee extends Employee {
    public OrdinaryEmployee(String name, double todaySalary, int workDay, double grade) {
        super(name, todaySalary, workDay, grade);
    }

    @Override
    public void printSalary() {
        System.out.print("普通员工");
        super.printSalary();
    }
}
