package com.layout_objects;

import javax.swing.*;
import java.awt.*;

public class Border_layout {

    JFrame home;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    public Border_layout() {
       home = new JFrame("Using a border layout.");
       button1 = new JButton();
       button2 = new JButton();
       button3 = new JButton();
       button4 = new JButton();

       home.add(button4, BorderLayout.CENTER);
       home.add(button3, BorderLayout.NORTH);
       home.add(button2, BorderLayout.EAST);
       home.add(button1, BorderLayout.WEST);

       home.setSize(500, 500);
       home.setVisible(true);
    }
}
