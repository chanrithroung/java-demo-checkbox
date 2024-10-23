package mygui;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JFrame {
    JButton btn;

    public MyButton() {
        btn = new JButton("Button");
        btn.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        btn.setBounds(80, 30, 150, 50);
        add(btn);
        setLayout(null);
        setVisible(true);
        setSize(300, 300);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MyButton();
    }
}
