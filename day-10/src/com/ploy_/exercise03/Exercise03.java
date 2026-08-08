package com.ploy_.exercise03;

public class Exercise03 {
    public static void main(String[] args) {
        OrdinaryEmployee oe = new OrdinaryEmployee("tom", 500, 30, 1);
        oe.printSalary();
        Manager m = new Manager("jack", 500, 30, 1.2);
        m.printSalary();
    }
}
