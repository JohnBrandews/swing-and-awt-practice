import java.awt.*;
import java.awt.event.*;

public class ButtonClickListener extends Frame implements KeyListener {
    private Label statusLabel;

    public ButtonClickListener() {
        setTitle("Button Click Listener Example");
        setSize(400, 200);
        setLayout(new FlowLayout());

        Button newButton = new Button("New");
        Button editButton = new Button("Edit");
        Button exitButton = new Button("Exit");

        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);

        newButton.addKeyListener(this);
        editButton.addKeyListener(this);
        exitButton.addKeyListener(this);

        add(newButton);
        add(editButton);
        add(exitButton);
        add(statusLabel);

        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        String buttonLabel = "";

        switch (keyCode) {
            case KeyEvent.VK_N:
                buttonLabel = "New";
                break;
            case KeyEvent.VK_E:
                buttonLabel = "Edit";
                break;
            case KeyEvent.VK_X:
                buttonLabel = "Exit";
                break;
        }

        statusLabel.setText(buttonLabel + " button clicked");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not needed for this example
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not needed for this example
    }

    public static void main(String[] args) {
        new ButtonClickListener();
    }
}
