package com.ploy_.ployparameter;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual() {
        return salary * 12;
    }
}
