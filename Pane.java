import java.awt.*;
public class Pane{
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        frame.add(panel);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}