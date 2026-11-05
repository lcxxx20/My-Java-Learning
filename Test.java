package com.test1;

public class Test {
    public static void main(String[] args){
        MyCallable m=new MyCallable();
        m.start();
        for(int i=0;i<5;i++){
            System.out.println("这是main函数里面的循环"+i);
        }
    }
}
