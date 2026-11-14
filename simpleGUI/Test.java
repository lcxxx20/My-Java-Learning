package com.iwnin;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args){
        JFrame frame=new JFrame("这是我的窗口");
        Panel panel=new Panel();
        JButton but=new JButton("点击我");
        but.setFont(new Font("Microsoft YaHei",Font.PLAIN,14));
        panel.add(but);
        panel.add(new TextField());
        frame.add(panel);
        frame.setBounds(100,100,500,300);
        frame.setVisible(true);
    }
}
