package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Petro on 06.03.2017.
 */
public class Dialog {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog");
        frame.setSize(400,150);
        frame.setVisible(true);
        JPanel jpan = new JPanel();
        frame.add(jpan);
        GridBagLayout gbLayout = new GridBagLayout();
        jpan.setLayout(gbLayout);
        GridBagConstraints gbCont = new GridBagConstraints();
        gbCont.weightx=0;
        gbCont.weighty=0;
//Label1(login)
        JLabel l1 = new JLabel("Login: ");
        gbCont.gridx=0;
        gbCont.gridy=0;
        gbCont.gridheight=1;
        gbCont.gridwidth=1;
        jpan.add(l1,gbCont);
//Label2(password)
        JLabel l2 = new JLabel("Password: ");
        gbCont.gridx=0;
        gbCont.gridy=1;
        gbCont.gridheight=1;
        gbCont.gridwidth=1;
        jpan.add(l2,gbCont);
//TextField(login)
        JTextField t1 = new JTextField(20);
        gbCont.gridx=1;
        gbCont.gridy=0;
        gbCont.gridheight=1;
        gbCont.gridwidth=4;
        jpan.add(t1,gbCont);

//TextField(password)
        JTextField t2 = new JTextField(20);
        gbCont.gridx=1;
        gbCont.gridy=1;
        gbCont.gridheight=1;
        gbCont.gridwidth=4;
        jpan.add(t2,gbCont);
//Button(ok)
        JButton b1 = new JButton("OK");
        gbCont.gridx=0;
        gbCont.gridy=2;
        gbCont.gridheight=1;
        gbCont.gridwidth=1;
        jpan.add(b1,gbCont);
//Button(ok)
        JButton b2 = new JButton("Cancle");
        gbCont.gridx=4;
        gbCont.gridy=2;
        gbCont.gridheight=1;
        gbCont.gridwidth=2;
        jpan.add(b2,gbCont);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(new JFrame(), "Ok)");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        jpan.revalidate();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
