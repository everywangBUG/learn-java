package com.equalsExercise01;

public class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person person = (Person)obj;
            return this.name.equals(person.name) && this.age.equals(person.age);
        }
        return false;
    }
}
