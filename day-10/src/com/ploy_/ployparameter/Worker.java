package com.ploy_.ployparameter;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name);
        setName(name);
        setSalary(salary);
    }

    public void work() {
        System.out.println(super.getName() + "员工在工作，薪水是" + getAnnual());
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + 1000;
    }
}
