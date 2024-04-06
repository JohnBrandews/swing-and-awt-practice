import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

public class AWTBorderLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT BorderLayout Demo");
        frame.setLayout(new BorderLayout());

        // Create buttons
        Button northButton = new Button("WelCome");
        Button southButton = new Button("Geeks");
        Button eastButton = new Button("Layout");
        Button westButton = new Button("Border");
        Button centerButton = new Button("GeeksforGeeks");

        // Add buttons to the frame
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
