package com.lc;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入三个数：");
        double[] A =new double[3];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextDouble();
        }
        sort(A);
        for (double v : A) {
            System.out.println(v);
        }
    }
    private static void sort(double[] A){
        double a;
        for(int i=0;i<A.length;i++){
            boolean x=false;
            for(int j=0;j<A.length-1-i;j++){
                if(A[j]>A[j+1]){
                    a=A[j];
                    A[j]=A[j+1];
                    A[j+1]=a;
                    x=true;
                }
            }
            if(!x) break;
        }
    }
}
