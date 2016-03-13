package in.codekamp.graphicsProject;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 13/03/16.
 */
public class CodekampPanel extends JPanel {

    public int ballXCord = 0;
    public int ballYCord = 100;
    public Color ballColor = Color.RED;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        System.out.println("Paint function called");

        g.setColor(ballColor);
        g.fillOval(ballXCord, ballYCord, 100, 100);
    }
}
