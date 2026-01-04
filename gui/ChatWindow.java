package gui;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ChatWindow {

    public static void open() {
        SwingUtilities.invokeLater(() -> {
            JFrame chatFrame = new JFrame("Chat with me!");
            chatFrame.setSize(300, 600);
            chatFrame.setVisible(true);

            JTextField inputField = new JTextField();
            chatFrame.add(inputField);

            chatFrame.setVisible(true);
        });
    }
}
