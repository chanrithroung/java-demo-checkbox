package mygui;

import javax.swing.*;
import java.awt.*;

public class Test2 extends JFrame {
    JTextField txt;
    public Test2() {
        txt= new JTextField();
        txt.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        txt.setBounds(40, 30, 240, 50);
        add(txt);
        setLayout(null);
        setVisible(true);
        setSize(300, 200);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Test2();
    }
}
