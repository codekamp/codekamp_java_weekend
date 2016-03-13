package in.codekamp.ticTacToeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 12/03/16.
 */
public class GameUI extends JFrame implements ActionListener {
    private JPanel panel1;
    private JButton button12;
    private JButton button13;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button11;

    private int turn = 0;
    public GameUI() {

        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.panel1);

        this.button11.addActionListener(this);
        this.button12.addActionListener(this);
        this.button13.addActionListener(this);
        this.button21.addActionListener(this);
        this.button22.addActionListener(this);
        this.button23.addActionListener(this);
        this.button31.addActionListener(this);
        this.button32.addActionListener(this);
        this.button33.addActionListener(this);

        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.turn++;
        if(e.getSource() instanceof JButton) {
            JButton theClickedButton = (JButton) e.getSource();

            if((this.turn % 2) == 0) {
                theClickedButton.setText("0");
            } else {
                theClickedButton.setText("X");
            }
            theClickedButton.setEnabled(false);

            if(hasWon("X")) {
                System.out.println("Player 1 has won!");
                this.disableAllButtons();
            } else if (hasWon("0")) {
                System.out.println("Player 2 has won!");
                this.disableAllButtons();
            } else if(this.turn == 9) {
                System.out.println("match draw");
            }
        }
    }

    private boolean hasWon(String symbol) {
        if(this.button11.getText().equals(symbol) && this.button12.getText().equals(symbol) && this.button13.getText().equals(symbol)) {
            return true;
        }

        if(this.button21.getText().equals(symbol) && this.button22.getText().equals(symbol) && this.button23.getText().equals(symbol)) {
            return true;
        }

        if(this.button31.getText().equals(symbol) && this.button32.getText().equals(symbol) && this.button33.getText().equals(symbol)) {
            return true;
        }

        if(this.button11.getText().equals(symbol) && this.button22.getText().equals(symbol) && this.button33.getText().equals(symbol)) {
            return true;
        }

        return false;
    }

    private void disableAllButtons() {
        this.button11.setEnabled(false);
        this.button12.setEnabled(false);
        this.button13.setEnabled(false);
        this.button21.setEnabled(false);
        this.button22.setEnabled(false);
        this.button23.setEnabled(false);
        this.button31.setEnabled(false);
        this.button32.setEnabled(false);
        this.button33.setEnabled(false);
    }
}
