package com.lj;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("张三", 18, 177.5);
        students[1] = new Student("李加成", 21, 185.5);
        students[2] = new Student("李嘉惩", 20, 183.5);
        students[3] = new Student("李四", 30, 175.5);
        Arrays.sort(students, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return (o1.getAge() - o2.getAge());
            }
        });
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
