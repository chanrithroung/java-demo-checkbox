package mygui.icons;

import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {
       JFrame frame = new JFrame("My App");
       frame.setSize(1200, 800);
       frame.setLocationRelativeTo(null);




       JTextField text = new JTextField();
       text.setBounds(100, 100, 300, 40);
       text.setFont( new Font("Arial Narrow", Font.ITALIC, 30));

       JButton btn = new JButton("Button");
       btn.setFont(new Font("Helvitica Neue", Font.PLAIN, 30));
       btn.setBounds(10, 10, 120, 60);


        JLabel label = new JLabel();
        label.setText("Form Register");
        label.setFont(new Font("Helvitica Neue", Font.BOLD, 20));


       frame.add(text);
       frame.add(btn);


       frame.setLayout(null);
       frame.setVisible(true);
    }
}
