package in.codekamp;

import javax.swing.*;

/**
 * Created by cerebro on 07/03/16.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Window 1");
        frame1.setVisible(true);

        BlueFrame blueFrame1 = new BlueFrame("Window 2");
        blueFrame1.setVisible(true);

        BlueFrame blueFrame2 = new BlueFrame("Window 3");
        blueFrame2.setVisible(true);
    }
}
