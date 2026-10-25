package com.usb;

public class Test {
    public static void main(String[] args) {
        PC pc=new PC();
        pc.insertUSB(new Mouse());
        pc.insertUSB(new Keyboard());
        pc.insertUSB(new Microphone());
        pc.PCopen();
        System.out.println("-------------------");
        pc.PCclose();
    }
}
