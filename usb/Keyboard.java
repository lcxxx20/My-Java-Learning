package com.usb;

public class Keyboard implements USB{
    public void poweron(){
        System.out.println("键盘启动了");
    }
    public void poweroff(){
        System.out.println("键盘关闭了");
    }
}
