package com.ekagra;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LCM extends JFrame{
    int lcm=0;
    int type;
    int type2;
    int hcf=0;

    private JButton button;
    private JTextField text, text2;
    private JLabel label1, label2, label3;

    public LCM() {
        setLayout(new FlowLayout());

        label1 = new JLabel("What's your number 1");
        add(label1);

        text= new JTextField(5);
        add(text);

        label3 = new JLabel("What's your number 2");
        add(label3);

        text2= new JTextField(5);
        add(text2);

        button = new JButton("Calculate");
        add(button);

        label2 = new JLabel("");
        add(label2);

        event e = new event();
        button.addActionListener(e);

    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                type = (int)(Double.parseDouble(text.getText()));
                type2 = (int)(Double.parseDouble(text2.getText()));
                int min= Math.min(type, type2);
                for(int i=min; i >= 1; i--)

                    if(type%i == 0 && type2%i == 0)
                    {
                        hcf = i;
                        break;
                    }
                lcm = type*type2/hcf;
                label2.setText("Your LCM is " +lcm);
            } catch (Exception pause) {
                label2.setText("Error ! :( (0, too long answer or words)");
            }   }}
    public static void main(String args[]) {
        LCM gui = new LCM();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(500, 250);
        gui.setTitle("LCM Finder: Ekagra");
    }
}