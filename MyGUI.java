package mygui;
import javax.swing.JFrame;
import java.awt.Font;

public class MyGUI {
    public static void main(String[] args) {
        JFrame fram = new JFrame("My App");
        fram.setSize(400, 500);
        fram.setResizable(true);
//        fram.setResizable(false);
        fram.setVisible(true);
    }
}