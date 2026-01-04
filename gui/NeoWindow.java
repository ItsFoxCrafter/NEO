package gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NeoWindow {

    public static void open() {
        SwingUtilities.invokeLater(() -> {
            JFrame neoFrame = new JFrame("NEO");
            neoFrame.setSize(500, 400);
            neoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            neoFrame.setVisible(true);
        });
    }
}
