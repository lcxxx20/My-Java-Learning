package com.usb;

public class Microphone implements USB{
    public void poweron(){
        System.out.println("麦克风启动了");
    }
    public void poweroff(){
        System.out.println("麦克风关闭了");
    }
}
