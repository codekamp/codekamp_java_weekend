package in.codekamp.firstGame;

import java.awt.*;

/**
 * Created by cerebro on 13/03/16.
 */
public class Demo {
    public static void main(String[] args) {
        CodekampFrame frame = new CodekampFrame();
        frame.setVisible(true);

        Image image1 = Resources.loadImage("run_anim1.png");
        Image image2 = Resources.loadImage("run_anim2.png");
        Image image3 = Resources.loadImage("run_anim3.png");
        Image image4 = Resources.loadImage("run_anim4.png");
        Image image5 = Resources.loadImage("run_anim5.png");

        int counter = 0;

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

            frame.mainPanel.repaint();

        }
    }
}
