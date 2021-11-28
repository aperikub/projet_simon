package Simon;


import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class MyWindow extends JFrame {


    public MyWindow() {
        super("Simon");
        //JFrame jFrame = new JFrame()
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setMinimumSize(new Dimension(600,600));
        //this.setShape(new Ellipse2D.Double(0,0,600,600));
        this.setLocationRelativeTo(null);


    }





}
