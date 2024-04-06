import java.awt.*;
import java.awt.event.*;

public class KenyanCityApp {
    public static void main(String[] args) {
        // Create a frame (main application window)
        Frame frame = new Frame("Kenyan Cities");
        frame.setSize(300, 150);

        // Create a Choice (drop-down menu) with Kenyan cities
        Choice cityChoice = new Choice();
        cityChoice.add("Nairobi");
        cityChoice.add("Mombasa");
        cityChoice.add("Kisumu");
        cityChoice.add("Eldoret");
        cityChoice.add("Nakuru");

        // Create a label to display the selected city
        Label selectedCityLabel = new Label("Selected City: ");
        selectedCityLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Set bold font

        // Add an item listener to the Choice
        cityChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String selectedCity = cityChoice.getSelectedItem();
                selectedCityLabel.setText("Selected City: " + selectedCity);
            }
        });

        // Create a panel to hold components
        Panel panel = new Panel();
        panel.add(cityChoice);
        panel.add(selectedCityLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Set frame properties
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
