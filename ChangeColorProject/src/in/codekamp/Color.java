package in.codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 07/03/16.
 */
public class Color implements ActionListener {
    public JButton changeColorButton;
    public JPanel bluePanel;
    private JLabel loveJavaLabel;
    public Color siblingWindow;

    @Override
    public void actionPerformed(ActionEvent e) {

        this.bluePanel.setBackground(java.awt.Color.GREEN);
        this.siblingWindow.loveJavaLabel.setForeground(java.awt.Color.RED);
    }
}
