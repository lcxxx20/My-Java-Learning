package com.test1;

public class Test1 {
    public static void main(String[] args){
        MyCallable1 m=new MyCallable1();
        Thread t=new Thread(m);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("这是main函数里面的循环"+i);
        }
    }
}
