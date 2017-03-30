package laba5.dialog1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Petro on 06.03.2017.
 */
public class Dialog1 {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){

        }
        JFrame frm = new JFrame("First visual applet");
        frm.setSize(300,200);
        Container cont = frm.getContentPane();
        cont.add(new JLabel("Hello world!"));
        WindowListener wndCloser = new WindowAdapter() {

            public void windowCloser(WindowEvent e) {
                System.exit(0);
            }

        };
        frm.addWindowListener(wndCloser);
        frm.setVisible(true);
    }
}
