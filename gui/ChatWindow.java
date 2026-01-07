package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ChatWindow {

    public static void open() {
        SwingUtilities.invokeLater(() -> {
            JFrame chatFrame = new JFrame("Chat with me!");
            chatFrame.setSize(300, 600);
            chatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextField inputField = new JTextField();
            inputField.setToolTipText("Type your message here...");
            inputField.setFont(inputField.getFont().deriveFont(14f));
            inputField.setColumns(20);
            chatFrame.add(inputField, BorderLayout.SOUTH);

            chatFrame.setVisible(true);
        });
    }
}
