package Simon;

import javax.swing.*;
import java.awt.*;

public class Game {
    private JPanel MainPanel;
    private JPanel blue;
    private JPanel red;
    private JPanel green;
    private JPanel yellow;
    private JButton buttonRed;
    private JButton buttonBlue;
    private JButton buttonGreen;
    private JButton buttonYellow;

    /*public static void main(String[] args) {
        JFrame frame = new JFrame("Game");
        frame.setContentPane(new Game().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }*/

    public Game(){

    }

    public void startGame(){
        buttonBlue.setVisible(false);
        buttonGreen.setVisible(false);
    }

    public JButton getButtonRed() {
        return buttonRed;
    }

    public JButton getButtonBlue() {
        return buttonBlue;
    }

    public JButton getButtonGreen() {
        return buttonGreen;
    }

    public JButton getButtonYellow() {
        return buttonYellow;
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }
}
