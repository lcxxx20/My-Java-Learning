package com.xsglxtjhb;

import java.util.*;

public class Test {
    public static void main(String[] args){
        Student s1=new Student();
        s1.setName("张三");
        s1.setScores(99);
        Student s2=new Student();
        s2.setName("李四");
        s2.setScores(88);
        Student s3=new Student();
        s3.setName("王五");
        s3.setScores(85.5);
        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list,new Comparator<Student>() {
            @Override
            public int compare(Student o1,Student o2){
                return Double.compare(o1.getScores(),o2.getScores());
            }
        });
        for(Student s:list){
            System.out.println(s.getName()+"的成绩是"+s.getScores());
        }
        new Test().animal();
    }
    public void animal(){
        Animal a=new Dog();
        a.cry();
        Animal b=new Animal(){
            @Override
            public void cry(){
                System.out.println("喵喵！");
            }
        };
        b.cry();
    }
}
