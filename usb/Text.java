package com.usb;

public class Text {
    public static void main(String[] args) {
        PC pc=new PC();
        pc.PCmouse(new Mouse());
        pc.PCKeyboard(new Keyboard());
        pc.PCmicrophone(new Microphone());
        pc.PCopen();
        System.out.println("-------------------");
        pc.PCmo(new Mouse());
        pc.PCk(new Keyboard());
        pc.PCmi(new Microphone());
        pc.PCclose();
    }
}
