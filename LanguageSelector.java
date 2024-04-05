import java.awt.*;
import java.awt.event.*;

public class LanguageSelector {
    public static void main(String[] args) {
        Frame frame = new Frame("Language Selector");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create the CheckboxGroup
        CheckboxGroup languages = new CheckboxGroup();

        // Create checkboxes for each language
        Checkbox englishCheckbox = new Checkbox("English", languages, false);
        Checkbox swahiliCheckbox = new Checkbox("Swahili", languages, false);
        Checkbox germanCheckbox = new Checkbox("German", languages, false);
        Checkbox frenchCheckbox = new Checkbox("French", languages, false);

        // Add checkboxes to the frame
        frame.add(englishCheckbox);
        frame.add(swahiliCheckbox);
        frame.add(germanCheckbox);
        frame.add(frenchCheckbox);

        frame.setVisible(true);
    }
}
