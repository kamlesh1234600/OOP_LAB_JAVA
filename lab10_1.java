
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class lab10_1 {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Date and Time Applet");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1));

        // Title Label
        JLabel title = new JLabel("Current Date:", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));

        // Date Label
        JLabel dateLabel = new JLabel("", JLabel.CENTER);
        dateLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Time Title
        JLabel timeTitle = new JLabel("Current Time:", JLabel.CENTER);
        timeTitle.setFont(new Font("Arial", Font.BOLD, 18));

        // Time Label
        JLabel timeLabel = new JLabel("", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Add components
        frame.add(title);
        frame.add(dateLabel);
        frame.add(timeTitle);
        frame.add(timeLabel);

        // Show Frame
        frame.setVisible(true);

        // Date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        dateLabel.setText(dateFormat.format(new Date()));

        // Timer to update time every second
        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
            timeLabel.setText(timeFormat.format(new Date()));
        });

        timer.start();
    }
}