import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;


public class CalculateArea {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame has been activated ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.getContentPane().setBackground(new Color(100, 255, 255));

        ImageIcon image = new ImageIcon("ChapterOne.java");
        frame.setIconImage(image.getImage());

    }
}
