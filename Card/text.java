package kapian;

import java.util.Scanner;

public class text {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("请输入你要办的卡（金卡1/银卡2）");
        x=sc.nextInt();
        if(x==1){
            gold a=new gold();
            System.out.println("请输入姓名：");
            String n=sc.next();
            a.setName(n);
            System.out.println("请输入消费金额：");
            double m=sc.nextDouble();
            a.setMoney(m);
            System.out.println("姓名："+a.getName());
            System.out.println("余额："+a.getMoney(m));
        }
        if(x==2){
            silver b=new silver();
            System.out.println("请输入姓名：");
            String n=sc.next();
            b.setName(n);
            System.out.println("请输入消费金额：");
            double m=sc.nextDouble();
            b.setMoney(m);
            System.out.println("姓名："+b.getName());
            System.out.println("余额："+b.getMoney(m));
        }
    }
}
