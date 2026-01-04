package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class NeoWindow {

    public static void open() {
        // Always open Swing on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("NEO");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Optional label inside window
            JLabel label = new JLabel("Hello, I'm NEO", JLabel.CENTER);
            frame.add(label);

            frame.setVisible(true); // ✅ must call this
        });
    }
}
