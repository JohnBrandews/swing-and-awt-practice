import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        // Create the JFrame
        JFrame frm = new JFrame("User Interface Example");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(400, 200); // Set the frame size

        // Create components
        JLabel label = new JLabel("Enter your text:");
        JTextField textField = new JTextField(20); // 20 columns wide
        JButton okayButton = new JButton("Okay");
        JButton cancelButton = new JButton("Cancel");

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Use FlowLayout for simplicity
        panel.add(label);
        panel.add(textField);
        panel.add(okayButton);
        panel.add(cancelButton);

        // Add the panel to the frame
        frm.add(panel);

        // Display the frame
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyFrame());
    }
}
