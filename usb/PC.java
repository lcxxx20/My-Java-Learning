package com.usb;
import java.util.ArrayList;
import java.util.List;
public class PC{
    List<USB> usbList=new ArrayList<>();
    public void insertUSB(USB usb){
        usbList.add(usb);
    }
    public void PCopen(){
        for(USB usb:usbList){
            usb.poweron();
        }
        System.out.println("电脑开机成功");
    }
    public void PCclose(){
        for(USB usb:usbList){
            usb.poweroff();
        }
        System.out.println("电脑关机成功");
    }
}
