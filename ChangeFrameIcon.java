package mygui;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;

public class ChangeFrameIcon {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Swing frame Icon example.");

        // Load the image using ImageIcon
        ImageIcon icon  = new ImageIcon("icons/icon1.jpg");
        Image image = icon.getImage(); // Convert imageIcon to Image

        frame.setIconImage(image);
        frame.setSize(1200, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}



//package frameicons;
//
//import javax.swing.JFrame;
//import javax.swing.ImageIcon;
//import java.awt.Image;
//
//public class FrameIcons {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Icon Frame");

//        ImageIcon icon = new ImageIcon(FrameIcons.class.getResource("/frameicons/icon.jpg"));
//        Image image = icon.getImage();
//
//
//
//
//        frame.setSize(1200, 800);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}