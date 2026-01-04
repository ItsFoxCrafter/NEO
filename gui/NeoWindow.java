package gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NeoWindow {

    public static void open() {
        SwingUtilities.invokeLater(() -> {
            JFrame NeoFrame = new JFrame("NEO");
            NeoFrame.setSize(500, 400);
            NeoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            NeoFrame.setVisible(true);

            JFrame ChatFrame = new JFrame("Chat with me!");
            ChatFrame.setSize(300, 600);
            ChatFrame.setVisible(true);
        });
    }
}
