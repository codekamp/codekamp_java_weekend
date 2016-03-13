package in.codekamp.graphicsProject;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 13/03/16.
 */
public class CodekampFrame extends JFrame {

    public CodekampPanel panel1;

    public CodekampFrame() {
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel1 = new CodekampPanel();
        this.panel1.setPreferredSize(new Dimension(600, 600));

        this.setContentPane(this.panel1);
        this.pack();
    }
}
