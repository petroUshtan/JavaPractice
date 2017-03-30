package lab5.algebra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Petro on 06.03.2017.
 */
public class TestVector {
    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};
        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){

        }
        JFrame frame = new JFrame("Algebra");
        frame.setSize(300, 70);
        Container cont = new Container();
        frame.add(cont);
        cont.setLayout(new BoxLayout(cont, BoxLayout.X_AXIS));
        cont.add(new JLabel("v1 * v2 = "+v1.mult(v2)));
        cont.add(new JLabel("v1 * v2 = "+DoubleVector.mult(v1,v2)));
        cont.add(new JLabel("v1 * v3 = "+v1.mult(v3)));
        WindowListener wndCloser=new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        frame.addWindowListener(wndCloser);
        frame.setVisible(true);
    }

}
