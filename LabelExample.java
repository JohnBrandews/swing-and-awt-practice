import java.awt.*;

public class LabelExample {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400,300);
        Label label = new Label("Anonymous");
        frame.add(label);
        frame.setVisible(true);
    }
}
