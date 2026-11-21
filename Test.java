package com.jsj;

import java.awt.*;
import java.awt.event.ActionListener;

import org.mariuszgromada.math.mxparser.Expression;

public class Test {
    public static void main(String[] args) {
        Frame frame = new Frame("计算器");

        Panel panel1 = new Panel();
        TextField textField = new TextField(15);
        panel1.add(textField);

        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(4, 4, 4, 4));

        ActionListener inputListener = e -> {
            textField.setText(textField.getText() + e.getActionCommand());
        };

        String[] keys = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String key : keys) {
            Button btn = new Button(key);

            if (key.equals("=")) {
                // 等于号的计算逻辑（已适配高版本JDK）
                btn.addActionListener(e -> {
                    String expression = textField.getText();
                    if (expression.isEmpty()) return;

                    try {
                        // 核心计算代码
                        Expression exp = new Expression(expression);
                        double result = exp.calculate();

                        if (Double.isNaN(result)) {
                            textField.setText("格式错误");
                        } else if (result == (long) result) {
                            textField.setText(String.format("%d", (long) result));
                        } else {
                            textField.setText(String.valueOf(result));
                        }
                    } catch (Exception ex) {
                        textField.setText("错误");
                    }
                });
            } else if (key.equals("C")) {

                btn.addActionListener(e -> textField.setText(""));
            } else {

                btn.addActionListener(inputListener);
            }
            panel2.add(btn);
        }

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}