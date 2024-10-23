package mygui;
import javax.swing.*;
import java.awt.*;

public class MyTextArea {
    public static void main(String []args) {
        JFrame frame = new JFrame("Text Area Demo");
        frame.setLayout(null);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Text Area
        TextArea textArea = new TextArea("Welcome to ETEC I.T Professional.");
        textArea.setBounds(200, 100, 300, 400);

        // label
        JLabel label = new JLabel("Result");
        label.setFont(new Font("Helvitica Neue", Font.PLAIN, 30));
        label.setBounds(20, 100, 120, 35);


        frame.add(textArea); frame.add(label);

        frame.setVisible(true);


    }

}
