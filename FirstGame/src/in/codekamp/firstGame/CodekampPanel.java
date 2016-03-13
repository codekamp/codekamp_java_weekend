package in.codekamp.firstGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 13/03/16.
 */
public class CodekampPanel extends JPanel {

    public Image playerImage = Resources.loadImage("run_anim1.png");

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        g.setColor(new Color(161, 204, 255));
        g.fillRect(0, 0, 800, 450);
        g.drawImage(Resources.loadImage("grass.png"), 0, 405, null);
        g.drawImage(playerImage, 300, 315, null);
    }
}
