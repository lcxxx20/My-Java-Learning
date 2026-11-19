import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args){
        Frame fr=new Frame("测试对话框");
        Dialog dg1=new Dialog(fr,"模式对话框",true);
        Dialog dg2=new Dialog(fr,"非模式对话框",false);
        Button button1=new Button("打开模式对话框");
        Button button2=new Button("打开非模式对话框");
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dg1.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               dg2.setVisible(true);
            }
        });
        fr.add(button1,BorderLayout.NORTH);
        fr.add(button2);
        fr.pack();
        fr.setVisible(true);
    }
}
