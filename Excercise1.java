package mygui;

import javax.swing.*;
import java.awt.*;

public class Excercise1 extends JFrame {
//    JLabel label;
//    public Excercise1() {
//        label = new JLabel("Hello AWT Font");
//        label.setFont(new Font("Helvetica Neue", Font.BOLD, 30));
//        label.setBounds(50, 0, 300, 500);
//        add(label);
//        setLayout(null);
//        setVisible(true);
//        setSize(300, 300); // set form size
//        setLocationRelativeTo(null); // make the form center the screen
//
//    }


    JLabel label;

    public Excercise1(){
        label = new JLabel("Hello awt Form.");
        label.setFont(new Font("Helvetica Neue", Font.BOLD, 30));


        label.setBounds(20, 50, 300, 30);
        add(label);

        setLayout(null);
        setSize(300, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Excercise1();
    }


}
