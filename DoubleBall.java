package com.lc;

import java.util.Random;
import java.util.Scanner;

public class DoubleBall {
    public static void main(String[] args) {
        int[] p=Rand();
        System.out.println("中奖号码是：");
        Print(p);
        System.out.println("请输入你购买的双色球号：（前四个数1-33，最后一个数1-16）");
        int[] P=new int[5];
        SC(P);
        System.out.println("你购买的双色球号是：");
        Print(P);
        int countred=comparered(P,p);
        int countblue=compareblue(P,p);
        prize(countred,countblue);
    }
    private static void SC(int[] p){                //输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入红球号：（1-33）");
        for(int i=0;i<p.length-1;){
            int x=sc.nextInt();
            if(x<1||x>33){
                System.out.println("超出范围，重新输入：");
            }else {
                p[i]=x;
                i++;
            }
        }
        System.out.println("请输入蓝球号：（1-16）");
        for(int i=0;i<1;){
            int x=sc.nextInt();
            if(x<1||x>16){
                System.out.println("超出范围，重新输入：");
            }else{
                p[p.length-1]=x;
                i++;
            }
        }
    }
    private static void Print(int[] p){             //输出
        for (int j : p) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    private static int[] Rand(){                    //生成随机数
        Random r=new Random();
        int[] p=new int[5];
        for (int i = 0; i <p.length-1; i++) {
            p[i]=r.nextInt(1,34);
        }
        p[p.length-1]=r.nextInt(1,17);
        return p;
    }
    private static int comparered(int[] P,int[] p){         //比较红球有几个相同的（不区分位置）
        int countred=0;
        for(int i=0;i<p.length-1;i++){
            for(int j=0;j<P.length-1;j++){
                if(P[j]==p[i]){
                    countred++;
                    break;
                }
            }
        }
        return countred;
    }
    private static int compareblue(int[] P,int[] p){        //比较蓝球是否相同
        int countblue=0;
        if(P[P.length-1]==p[p.length-1]){
            countblue++;
        }
        return countblue;
    }
    private static void prize(int countred,int countblue){          //判断是否中奖（中奖条件可更改）
        if(countred==1&&countblue==1) System.out.println("恭喜你，中了四等奖");
        else if(countred==2&&countblue==1) System.out.println("恭喜你，中了三等奖!");
        else if(countred==3&&countblue==1) System.out.println("恭喜你，中了二等奖!!");
        else if(countred==4&&countblue==1) System.out.println("恭喜你，中了一等奖!!!");
        else System.out.println("谢谢惠顾！");
    }
}
