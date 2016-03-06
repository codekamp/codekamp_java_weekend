import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 06/03/16.
 */
public class FirstForm implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    public JButton addButton;
    public JButton subtractButton;
    public JButton multiplyButton;
    public JPanel mainPanel;
    private JLabel resultLabel;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.addButton) {
            this.add();
        } else if(e.getSource() == this.subtractButton) {
            this.subtract();
        } else if(e.getSource() == this.multiplyButton) {
            this.multiply();
        }
    }

    private void add() {
        String string1 = this.textField1.getText();
        String string2 = this.textField2.getText();

        int num1 = Integer.parseInt(string1);
        int num2 = Integer.parseInt(string2);

        int result  = num1 + num2;

        String resultString = Integer.toString(result);
        this.resultLabel.setText(resultString);
    }

    private void subtract() {

        String string1 = this.textField1.getText();
        String string2 = this.textField2.getText();

        int num1 = Integer.parseInt(string1);
        int num2 = Integer.parseInt(string2);

        int result  = num1 - num2;

        String resultString = Integer.toString(result);
        this.resultLabel.setText(resultString);
    }

    private void multiply() {
        String string1 = this.textField1.getText();
        String string2 = this.textField2.getText();

        int num1 = Integer.parseInt(string1);
        int num2 = Integer.parseInt(string2);

        int result  = num1 * num2;

        String resultString = Integer.toString(result);
        this.resultLabel.setText(resultString);
    }
}
