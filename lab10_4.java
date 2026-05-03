

import javax.swing.*;
import java.awt.*;

class FontAnimationPanel extends JPanel implements Runnable {

    int size = 000;          // starting font size
    boolean increasing = true;

    public FontAnimationPanel() {
        Thread t = new Thread(this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Arial", Font.BOLD, size));
        g.drawString("KAMLESH", 100, 150);
    }

    public void run() {
        while (true) {

            if (increasing) {
                size += 2;
                if (size >= 96) {
                    increasing = false;
                }
            } else {
                size -= 2;
                if (size <= 6) {
                    increasing = true;
                }
            }

            repaint(); // redraw with new size

            try {
                Thread.sleep(50); // control speed
            } catch (Exception e) {}
        }
    }
}

public class lab10_4 extends JFrame {

    public lab10_4() {
        setTitle("Font Animation");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new FontAnimationPanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new lab10_4();
    }
}