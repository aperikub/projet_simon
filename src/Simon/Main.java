package Simon;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {



    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        MyWindow myWindow = new MyWindow();
        //myWindow.setMinimumSize(new Dimension(600,600));
        Game game = new Game();
        Menu menu = new Menu();
        myWindow.setJMenuBar(menu);
        myWindow.setVisible(true);
        myWindow.pack();
        myWindow.setContentPane(game.getMainPanel());
        menu.getRollMenuSub1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.startGame();
                menu.GameMenu();
            }
        });
        //menu.getRollMenuSub1().addActionListener();
    }


}
