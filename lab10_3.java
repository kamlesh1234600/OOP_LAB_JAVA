

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DrawPanel extends JPanel implements MouseListener, MouseMotionListener {

    int x1, y1, x2, y2;

    public DrawPanel() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(x1, y1, x2, y2);
    }

    // When mouse is pressed → starting point
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    // When mouse is dragged → ending point updates
    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint(); // redraw line
    }

    // Unused methods (must implement)
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
}

public class lab10_3 extends JFrame {

    public lab10_3() {
        setTitle("Draw Line with Mouse");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new DrawPanel());

        setVisible(true);
    }

    public static void main(String[] args) {
        new lab10_3();
    }
}