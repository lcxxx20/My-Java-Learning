package com.usb;

public class Mouse implements USB{
    @Override
    public void poweron() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void poweroff() {
        System.out.println("鼠标关闭了");
    }
}
