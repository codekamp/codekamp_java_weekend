package in.codekamp.firstGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 13/03/16.
 */
public class CodekampFrame extends JFrame {

    public CodekampPanel mainPanel;

    public CodekampFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.mainPanel = new CodekampPanel();
        this.mainPanel.setPreferredSize(new Dimension(800, 450));

        this.setContentPane(mainPanel);
        this.pack();
    }

}
