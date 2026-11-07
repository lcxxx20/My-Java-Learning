package com.test1;

public class MyCallable1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("这是MyCallable1里面的循环"+i);
        }
    }
}
