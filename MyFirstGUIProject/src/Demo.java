import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 05/03/16.
 */
public class Demo implements ActionListener {

    public static JButton button1;
    public static JButton button2;

    public static void main(String[] args) {

        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //We are making a JPanel and setting it as the main panel of JFrame.
        JPanel panel1 = new JPanel();
        Dimension dimension1 = new Dimension(800, 600);
        panel1.setPreferredSize(dimension1);
        frame1.setContentPane(panel1);
        panel1.setBackground(Color.BLUE);


        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(50, 590));
        panel2.setBackground(Color.RED);

        JPanel panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(150, 590));
        panel3.setBackground(Color.GREEN);

        JPanel panel4 = new JPanel();
        panel4.setPreferredSize(new Dimension(580, 590));
        panel4.setBackground(Color.YELLOW);


        panel1.add(panel2);
        panel1.add(panel3);
        panel1.add(panel4);

        Demo.button1 = new JButton("Register at CodeKamp!");
        panel4.add(Demo.button1);
        Demo.button1.setForeground(Color.RED);

        Demo demo1 = new Demo();
        Demo.button1.addActionListener(demo1);

        Demo.button2 = new JButton("Contact Us");
        panel4.add(Demo.button2);
        Demo.button2.addActionListener(demo1);

        JLabel label1 = new JLabel("Hi");
        panel2.add(label1);

        JTextField field1 = new JTextField("hello");
        panel3.add(field1);


        frame1.pack();
        frame1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Demo.button1) {
            System.out.println("Register at CodeKamp button clicked");
        } else if(e.getSource() == Demo.button2) {
            System.out.println("Contact Us button clicked");
        }
    }
}
