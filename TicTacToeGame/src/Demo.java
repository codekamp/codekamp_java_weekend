import javax.swing.*;

/**
 * Created by cerebro on 06/03/16.
 */
public class Demo {
    public static void main(String[] args) {

        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FirstForm form1 = new FirstForm();
        frame1.setContentPane(form1.mainPanel);

        form1.addButton.addActionListener(form1);
        form1.subtractButton.addActionListener(form1);
        form1.multiplyButton.addActionListener(form1);

        frame1.pack();
        frame1.setVisible(true);
    }
}
