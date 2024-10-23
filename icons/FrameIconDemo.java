package mygui.icons;
import javax.swing.JFrame;

import javax.swing.JLabel;

import java.awt.*;


public class FrameIconDemo extends JFrame {
    private final JLabel label;
    public FrameIconDemo() {
        setSize(1000, 600);
        setTitle("My First App");
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        label = new JLabel();
        label.setFont(new Font("Helvitaca Neue", Font.BOLD, 40));
        label.setText("Hello this is my text.");
        label.setBounds(300, 10, 500, 40);

        add(label);

        setVisible(true);
    }


    public static void main(String[] args) {
        new FrameIconDemo();
    }


}
