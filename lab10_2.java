

import javax.swing.*;
import java.awt.*;

class ImagePanel extends JPanel {

    Image img;

    public ImagePanel() {
        // Load image from same folder
        img = Toolkit.getDefaultToolkit().getImage("image.jpg");
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (img != null) {
            g.drawImage(img, 50, 50, this);
        } else {
            g.drawString("Image not loaded", 50, 50);
        }
    }
}

public class lab10_2 extends JFrame 
{

    public lab10_2() {
        setTitle("Display Image");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new ImagePanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new lab10_2();
    }
}