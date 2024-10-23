package mygui;

import javax.swing.*;
import java.awt.*;

public class Checkbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo checkbox.");


        ButtonGroup group = new ButtonGroup();


        JCheckBox java = new JCheckBox("Java", false);
        JCheckBox python = new JCheckBox("Python", false);
        JCheckBox cpp = new JCheckBox("C++", false);

        java.setBounds(50, 100, 100, 50);
        python.setBounds(50, 150, 100, 50);
        cpp.setBounds(50, 200, 100, 50);


        group.add(java);
        group.add(python);
        group.add(cpp);


        frame.add(java);
        frame.add(python);
        frame.add(cpp);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
