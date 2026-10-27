package com.lj;

import java.util.Arrays;
import java.util.Scanner;

public class MergeAlogorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] A=new int[4];
        int[] B=new int[5];
        System.out.println("请输入第一个长度为四的数组：");
        forin(A,sc);
        System.out.println("请输入第二个长度为五的数组：");
        forin(B,sc);
        int[] X=mergearr(A,B);
        System.out.println("拼接后的数组为："+java.util.Arrays.toString(X));
        int[][] Y=new int[2][];
        Y[0]=A;
        Y[1]=B;
        System.out.print("拼接后的数组转化成二维数组是：");
        System.out.println(Arrays.deepToString(Y));
    }
    private static void forin(int[] X,Scanner sc){
        for (int i = 0; i < X.length; i++) {
            X[i]=sc.nextInt();
        }
    }
    private static int[] mergearr(int[] A,int[] B){
        int[] X=new int[A.length+B.length];
        System.arraycopy(A,0,X,0,A.length);
        System.arraycopy(B,0,X,A.length,B.length);                          //拼接两个数组
        return X;
    }
}
