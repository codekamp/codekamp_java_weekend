package in.codekamp;

import javax.swing.*;
//import java.awt.Color;

/**
 * Created by cerebro on 07/03/16.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color color1 = new Color();
        frame1.setContentPane(color1.panel1);

        color1.panel1.setBackground(java.awt.Color.RED);

//        frame1.setBackground(Color.RED);

        frame1.pack();
        frame1.setVisible(true);
    }
}
