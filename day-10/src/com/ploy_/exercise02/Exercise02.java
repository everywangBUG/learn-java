package com.ploy_.exercise02;

public class Exercise02 {
    public static void main(String[] args) {
        Professor tom = new Professor("tom", 24, "高级职称", 12000);
        tom.introduce();
        AssociateProfessor jack = new AssociateProfessor("jack", 24, "中级职称", 10000);
        jack.introduce();
    }
}
