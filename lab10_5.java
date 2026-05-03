

import javax.swing.*;
import java.awt.*;

public class lab10_5 extends JFrame {

    public lab10_5() {

        setTitle("Font Styles Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("KAMLESH", 150, 100);
        
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("KAMLESH", 130, 170);
        
        g.setFont(new Font("Arial", Font.ITALIC, 40));
        g.drawString("KAMLESH", 110, 250);
    }

    public static void main(String[] args) {
        new lab10_5();
    }
}
