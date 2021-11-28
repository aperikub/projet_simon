package Simon;

import javax.swing.*;
import java.awt.*;

public class Menu extends JMenuBar {

    private JMenu rollMenu;
    private JMenuItem rollMenuSub1;
    private JMenuItem rollMenuSub2;
    private JMenuItem rollMenuSub3;
    private JMenuItem rollMenuSub4;
    public Menu() {
        super();
        rollMenu = new JMenu("partie");

        rollMenuSub1 = new JMenuItem("facile");
        rollMenuSub2 = new JMenuItem("moyen");
        rollMenuSub3 = new JMenuItem("difficile");
        rollMenuSub4 = new JMenuItem("cauchemar");
        rollMenu.setOpaque(true);
        //rollMenu.setBackground(Color.CYAN);

        rollMenu.add(rollMenuSub1);
        rollMenu.add(rollMenuSub2);
        rollMenu.add(rollMenuSub3);
        rollMenu.add(rollMenuSub4);
        this.add(rollMenu);

        //rollMenuSub1.addActionListener();
    }

    public JMenu getRollMenu() {
        return rollMenu;
    }

    public JMenuItem getRollMenuSub1() {
        return rollMenuSub1;
    }

    public JMenuItem getRollMenuSub2() {
        return rollMenuSub2;
    }

    public JMenuItem getRollMenuSub3() {
        return rollMenuSub3;
    }

    public JMenuItem getRollMenuSub4() {
        return rollMenuSub4;
    }
}
