package com.ploy_.exercise03;

public class Employee {
    private String name;
    private double todaySalary;
    private int workDay;
    private double grade;

    public Employee(String name, double todaySalary, int workDay, double grade) {
        this.name = name;
        this.todaySalary = todaySalary;
        this.workDay = workDay;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setTodaySalary(double todaySalary) {
        this.todaySalary = todaySalary;
    }

    public double getTodaySalary() {
        return todaySalary;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void printSalary() {
        System.out.println(this.name + "员工月薪：" + this.getTodaySalary() * this.getWorkDay() * this.getGrade());
    }
}
