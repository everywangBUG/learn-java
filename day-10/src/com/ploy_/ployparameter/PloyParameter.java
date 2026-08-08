package com.ploy_.ployparameter;

public class PloyParameter {
    public static void main(String[] args) {
        Manager tom = new Manager("tom", 20000);
        Worker jack = new Worker("jack", 15000);
        PloyParameter p = new PloyParameter();
        p.testWork(tom);
        p.testWork(jack);
    }

    // 获取任何员工的年工资，在main调用
    public double showEmpAnnual(Employee e) {
        return e.getAnnual();
    }

    public void testWork(Employee e) {
        // 如果是普通员工，调用work方法，如果是经理，调用manage方法
        if (e instanceof Worker) {
            // 向下转型
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        } else {
            System.out.println("什么都不做");
        }
    }
}
