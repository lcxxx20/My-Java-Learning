package com.xsglxtjhb;

public class Student extends Person{
    private double scores;
    @Override
    public void doWork(){
        System.out.println("学生正在学习");
    }
    public double getScores(){
        return scores;
    }
    public void setScores(double scores){
        this.scores=scores;
    }
}
