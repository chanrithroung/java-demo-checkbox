package mygui;
import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Demo Button");

        JTextArea textArea = new JTextArea("Hello Java Swing Text Area");
        textArea.setLineWrap(true);
        textArea.setBounds(50, 50, 300, 300);
        frame.add(textArea);

        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.decode("#edede9"));
        frame.setVisible(true);
    }
}