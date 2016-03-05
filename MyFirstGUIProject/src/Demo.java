import javax.swing.*;
import java.awt.*;

/**
 * Created by cerebro on 05/03/16.
 */
public class Demo {

    public static void main(String[] args) {

        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //We are making a JPanel and setting it as the main panel of JFrame.
        JPanel panel1 = new JPanel();
        Dimension dimension1 = new Dimension(800, 600);
        panel1.setPreferredSize(dimension1);
        frame1.setContentPane(panel1);
        panel1.setBackground(Color.blue);


        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(50, 600));
        panel2.setBackground(Color.red);

        JPanel panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(150, 600));
        panel3.setBackground(Color.green);

        JPanel panel4 = new JPanel();
        panel4.setPreferredSize(new Dimension(580, 600));
        panel4.setBackground(Color.yellow);


        panel1.add(panel2);
        panel1.add(panel3);
        panel1.add(panel4);

        JButton button1 = new JButton("Register at CodeKamp!");

        panel4.add(button1);

        frame1.pack();
        frame1.setVisible(true);
    }
}
