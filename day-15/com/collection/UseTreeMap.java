package com.collection;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
    treeMap是实现了sortedMap接口的排序map，treeMap不使用equals和hashCode方法，不需要重写这两个方法
    但是要重写compare方法，且比较的每种情况都要给出返回值0、-1或者1
 */
public class UseTreeMap {
    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score == o2.score) {
                    return 0;
                }
                return o1.score > o2.score ? 1 : -1;
            }
        });
        map.put(new Student("Tom", 76), 1);
        map.put(new Student("Jack", 80), 2);
        map.put(new Student("Sun", 65), 3);
        for (Student key : map.keySet()) {
            System.out.println(key);
        }
        // 这里打印为null，因为compare函数需要在相等的时候返回0
        System.out.println(map.get(new Student("Tom", 76)));
    }
}

class Student {
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("{%s: score=%d}", name, score);
    }
}
