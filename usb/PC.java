package com.usb;
public class PC implements USB{
    public void poweron(){
    }
    public void poweroff(){
    }
    public void PCmouse(USB usb){

        usb.poweron();
    }
    public void PCmicrophone(USB usb){

        usb.poweron();
    }
    public void PCKeyboard(USB usb){

        usb.poweron();
    }
    public void PCmo(USB usb){

        usb.poweroff();
    }
    public void PCmi(USB usb){

        usb.poweroff();
    }
    public void PCk(USB usb){

        usb.poweroff();
    }
    public void PCclose(){
        System.out.println("电脑关机成功");
    }
    public void PCopen(){
        System.out.println("电脑开机成功");
    }
}
