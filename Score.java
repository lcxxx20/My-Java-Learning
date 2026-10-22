package com.lc;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] d = new double[6];
        double j;
        System.out.println("请输入六个评委打出的分数：（0到100）");
        for (int i = 0; i < d.length; i++) {
            while (true) {
                System.out.println("请输入第" + (i + 1) + "个评委打的分");
                j = sc.nextDouble();
                if (j > 0 && j < 100) {
                    d[i] = j;
                    break;
                } else {
                    System.out.println("不在规定范围，请重新输入");
                }
            }
        }
        double max = highest(d);
        double min = minimum(d);
        double[] d1 = delete(d, max, min);
        double ave = average(d1);
        System.out.println("评委的平均分是：" + ave);
    }

    private static double highest(double[] d) {
        double max = d[0];
        for (int i = 1; i < d.length; i++) {
            if (max < d[i]) max = d[i];
        }
        return max;
    }

    private static double minimum(double[] d) {
        double min = d[0];
        for (int i = 1; i < d.length; i++) {
            if (min > d[i]) min = d[i];
        }
        return min;
    }

    private static double[] delete(double[] d, double max, double min) {
        boolean maxB = false;
        boolean minB = false;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == max && maxB == false) {
                d[i] = 0;
                maxB = true;
            }
            if (d[i] == min && minB == false) {
                d[i] = 0;
                minB = true;
            }
        }
        return d;
    }

    private static double average(double[] d) {
        double sum = d[0];
        for (int i = 1; i < d.length; i++) {
            sum = sum + d[i];
        }
        return sum / 4;
    }
}
