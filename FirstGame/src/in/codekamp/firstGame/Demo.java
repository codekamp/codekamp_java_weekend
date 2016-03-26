package in.codekamp.firstGame;

import java.awt.*;
import java.util.Random;

/**
 * Created by cerebro on 13/03/16.
 */
public class Demo {
    public static void main(String[] args) {
        CodekampFrame frame = new CodekampFrame();
        frame.setVisible(true);

        frame.mainPanel.setFocusable(true);
        frame.mainPanel.requestFocus();
        frame.mainPanel.addKeyListener(frame.mainPanel);

        Image image1 = Resources.loadImage("run_anim1.png");
        Image image2 = Resources.loadImage("run_anim2.png");
        Image image3 = Resources.loadImage("run_anim3.png");
        Image image4 = Resources.loadImage("run_anim4.png");
        Image image5 = Resources.loadImage("run_anim5.png");

        int counter = 0;
        Random random = new Random();
        Rectangle playerRect = new Rectangle();
        Rectangle blockRect = new Rectangle();

        while (true) {

            counter++;

            counter = counter % 8;

            switch (counter) {
                case 0:
                    frame.mainPanel.playerImage = image1;
                    break;
                case 1:
                    frame.mainPanel.playerImage = image2;
                    break;
                case 2:
                    frame.mainPanel.playerImage = image3;
                    break;
                case 3:
                    frame.mainPanel.playerImage = image4;
                    break;
                case 4:
                    frame.mainPanel.playerImage = image5;
                    break;
                case 5:
                    frame.mainPanel.playerImage = image4;
                    break;
                case 6:
                    frame.mainPanel.playerImage = image3;
                    break;
                case 7:
                    frame.mainPanel.playerImage = image2;
                    break;
                default:
                    break;
            }

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            frame.mainPanel.blockXCord -= 5;

            if(frame.mainPanel.blockXCord < -20) {
                frame.mainPanel.blockXCord = 900;
                int randomInt = random.nextInt(2);

                if(randomInt == 0) {
                    frame.mainPanel.blockYCord = 355;
                } else {
                    frame.mainPanel.blockYCord = 285;
                }

                frame.mainPanel.blockVisible = true;
            }

            frame.mainPanel.playerYCord += frame.mainPanel.playerYVel;
            frame.mainPanel.playerYVel += frame.mainPanel.playerYAcc;

            if(frame.mainPanel.playerYCord > 315) {
                frame.mainPanel.playerYCord = 315;
                frame.mainPanel.playerYVel = 0;
                frame.mainPanel.playerYAcc = 0;
            }

            playerRect.setBounds(frame.mainPanel.playerXCord, frame.mainPanel.playerYCord, 72, 90);
            blockRect.setBounds(frame.mainPanel.blockXCord, frame.mainPanel.blockYCord, 20, 50);

            if(frame.mainPanel.blockVisible && playerRect.intersects(blockRect)) {
                frame.mainPanel.playerXCord -= 50;
                frame.mainPanel.blockVisible = false;
            }

            if(frame.mainPanel.playerXCord < 0) {
                frame.mainPanel.gameOver = true;
                frame.mainPanel.repaint();
                break;
            }

            frame.mainPanel.repaint();

        }
    }
}
