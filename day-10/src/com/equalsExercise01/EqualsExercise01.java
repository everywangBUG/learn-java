package com.equalsExercise01;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person tom = new Person("tom", "12");
        Person jack = new Person("jack", "20");
        Person tom1 = new Person("tom", "12");
        System.out.println(tom.equals(jack));
        System.out.println(tom1.equals(tom));
    }
}


