package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Petro on 10.03.2017.
 */
public class Dialog4 extends JFrame {
    protected JTextField t1 ;
    protected JTextField t2 ;
    JLabel l1 = new JLabel("Input:    ");
    JLabel l2 = new JLabel("Output: ");
    protected JButton b1 = new JButton("Copy");
    protected Container c;
    protected JPanel p1, p2, p3;
    protected ActionListener copyBtnListener;

    public Dialog4(){
        super("Dialog4");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        copyBtnListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.setText(t1.getText());
            }
        };
        setSize(500, 200);
        c = getContentPane();
        p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        p1.add(l1);
        p1.add(t1);

        p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
        p2.add(l2);
        p2.add(t2);

        p3 = new JPanel();
        p3.add(b1);

        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.CENTER);
        c.add(p3, BorderLayout.SOUTH);

        p3.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        b1.addActionListener(copyBtnListener);
        WindowListener closer = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(closer);
        setVisible(true);
    }



    public static void main(String[] args) {
        new Dialog4();
    }

}
