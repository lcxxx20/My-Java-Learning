package com.mei;

import javax.swing.*;
import java.awt.*;

public class Test3 {
    public static void main(String[] args){
        JFrame frame=new JFrame("这是一个窗口");
        frame.setLayout(new BorderLayout(30,5));
        frame.add (new JButton("东侧按钮"),BorderLayout.EAST);
        frame.add(new JButton("西侧按钮"),BorderLayout.WEST);
        frame.add(new JButton("南侧按钮"),BorderLayout.SOUTH);
        frame.add(new JButton("北侧按钮"),BorderLayout.NORTH);
        frame.add(new JButton("中间按钮"),BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
