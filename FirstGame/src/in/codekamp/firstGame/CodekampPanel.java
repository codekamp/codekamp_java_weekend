package in.codekamp.firstGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by cerebro on 13/03/16.
 */
public class CodekampPanel extends JPanel implements KeyListener {

    public Image playerImage = Resources.loadImage("run_anim1.png");
    public int playerYCord = 315;
    public int playerXCord = 300;
    public int blockXCord = 900;
    public int blockYCord = 355;
    public int playerYVel = 0;
    public int playerYAcc = 0;
    public boolean blockVisible = true;
    public boolean gameOver = false;

    @Override
    public void paint(Graphics g) {
        super.paint(g);


        g.setColor(new Color(161, 204, 255));
        g.fillRect(0, 0, 800, 450);
        g.drawImage(Resources.loadImage("grass.png"), 0, 405, null);
        g.drawImage(playerImage, playerXCord, playerYCord, null);
        if(this.blockVisible) {
            g.drawImage(Resources.loadImage("block.png"), blockXCord, blockYCord, null);
        }

        if(gameOver) {
            g.setColor(Color.RED);
            g.drawString("Game Over", 200, 200);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_SPACE && this.playerYCord == 315) {
            this.playerYVel = -40;
            this.playerYAcc = 2;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
