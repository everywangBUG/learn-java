package com.ploy_.ployparameter;

public class Manager extends Employee {
    private double bonus; //奖金

    public Manager(String name, double salary) {
        super(name);
        setName(name);
        setSalary(salary);
    }

    public void manage() {
        System.out.println(super.getName() + "经理在管理， 薪水是" + getAnnual());
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
