package Simon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    private Timer t = new Timer(1000,null);
    private Color blueOff = new Color(47,59,77);
    private Color blueOn = new Color(0,0,255);
    private Color redOff = new Color(72,36,41);
    private Color redOn = new Color(255,0,0);
    private Color greenOff = new Color(41,69,39);
    private Color greenOn = new Color(46,255,0);
    private Color yellowOff = new Color(98,97,0);
    private Color yellowOn = new Color(255,255,0);
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
        t.setRepeats(false);
    }

    public void startGame(){
        buttonBlue.setBackground(blueOff);
        buttonGreen.setBackground(greenOff);
        buttonRed.setBackground(redOff);
        buttonYellow.setBackground(yellowOff);
        buttonBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lightButton(buttonBlue);
                t.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        offButton(buttonBlue);
                    }
                });
                t.start();
            }
        });


    }
    //faire une seul methode pour allumer et eteindre
    public void lightButton(JButton button){
        if(button == buttonBlue)
        buttonBlue.setBackground(blueOn);
    }

    public void offButton(JButton button){
        if(button == buttonBlue)
            buttonBlue.setBackground(blueOff);
    }

    public void returnToMenu(){
        buttonBlue.setVisible(true);
        buttonGreen.setVisible(true);
        buttonRed.setVisible(true);
        buttonYellow.setVisible(true);
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
