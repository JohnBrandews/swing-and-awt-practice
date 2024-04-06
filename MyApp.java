import javax.swing.*;

public class MyApp {
    public static void main(String[] args) {
        // Create a JFrame (main application window)
        JFrame frame = new JFrame("My Swing App"); // Set the window title

        JButton button = new JButton("click me");
        JLabel label = new JLabel("welcome");
        JPanel panel = new JPanel();
        // Add components to the panel...
        frame.add(button);
        frame.add(label);

        
        frame.setSize(800, 600); // Set dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        frame.add(panel); // Add the panel to the frame

        // Make the frame visible
        frame.setVisible(true);
    }
}
