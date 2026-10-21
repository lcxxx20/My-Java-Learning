package com.lc;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入四个整数：");
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        traverse(arr);
        System.out.println("数组中的最大数是" + Maximum(arr));
        System.out.println("请输入你想要查找的数字");
        int x = sc.nextInt();
        Existence(x, arr);
        System.out.println("请输入你要复制第几个数，从a到b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = copy(arr, a, b);
        System.out.println("复制出来的新数组是");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    private static void traverse(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) System.out.print(arr[i] + "}");
            else System.out.print(arr[i] + ", ");
        }
    }

    private static int Maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    private static void Existence(int x, int[] arr) {            //existence:存在性
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) count++;
        }
        if (count != 0) System.out.println("存在" + count + "个和" + x + "相等的数");
        else System.out.println("不存在与" + x + "相等的数");
    }

    private static int[] copy(int[] arr, int a, int b) {
        int[] arr1 = new int[b - a + 1];
        for (int i = 0, j = a; i < b - a + 1; i++, j++) {
            arr1[i] = arr[j];
        }
        return arr1;
    }
}
