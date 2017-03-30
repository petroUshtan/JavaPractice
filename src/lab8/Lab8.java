package lab8;

import lab7.Dialog4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Petro on 30.03.2017.
 */
public class Lab8 extends Dialog4 {
    ArrayList <String> array  = new ArrayList<String>();

    Lab8() {
        super();
        addPrintButton();
    }

    void addPrintButton(){
        JButton printBtn=new JButton("Print");
        super.p3.add(printBtn);
        super.b1.removeActionListener(super.copyBtnListener);
        super.b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Lab8.super.t2.setText(Lab8.super.t1.getText());
                array.add(Lab8.super.t2.getText());
            }
        });
        printBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(String elem : array){
                    System.out.println(elem);
                }
            }
        });
        super.c.repaint();
    }

    public static void main(String[] args) {
        new Lab8();
    }
}
