package in.codekamp.graphicsProject;

import java.awt.*;
import java.util.Random;

/**
 * Created by cerebro on 13/03/16.
 */
public class Demo {
    public static void main(String[] args) {

        CodekampFrame frame = new CodekampFrame();
        frame.setVisible(true);

        int ballXVel = 5;
        int ballYVel = 5;

        while (true) {
            frame.panel1.ballXCord += ballXVel;
            frame.panel1.ballYCord += ballYVel;

            if (frame.panel1.ballXCord > 500) {
                frame.panel1.ballXCord = 500;
                ballXVel = -5;
                frame.panel1.ballColor = Demo.randomColor();
            }

            if (frame.panel1.ballYCord > 500) {
                frame.panel1.ballYCord = 500;
                ballYVel = -5;
                frame.panel1.ballColor = Demo.randomColor();
            }

            if (frame.panel1.ballXCord < 0) {
                frame.panel1.ballXCord = 0;
                ballXVel = 5;
                frame.panel1.ballColor = Demo.randomColor();
            }

            if (frame.panel1.ballYCord < 0) {
                frame.panel1.ballYCord = 0;
                ballYVel = 5;
                frame.panel1.ballColor = Demo.randomColor();
            }

            frame.panel1.repaint();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static Color randomColor() {
        Random random = new Random();
        int randomInt = random.nextInt(5);

        Color randomColor;

        switch (randomInt) {
            case 0:
                randomColor = Color.GREEN;
                break;
            case 1:
                randomColor = Color.YELLOW;
                break;
            case 2:
                randomColor = Color.BLUE;
                break;
            case 3:
                randomColor = Color.RED;
                break;
            default:
                randomColor = Color.BLACK;
        }

        return randomColor;
    }
}
