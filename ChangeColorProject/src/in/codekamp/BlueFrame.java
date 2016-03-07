package in.codekamp;

import javax.swing.*;

/**
 * Created by cerebro on 07/03/16.
 */
public class BlueFrame extends JFrame {

    public BlueFrame(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color abcd1 = new Color();
        this.setContentPane(abcd1.bluePanel);
        abcd1.changeColorButton.addActionListener(abcd1);

        this.pack();



    }
}
